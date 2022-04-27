package com.controller;

import com.entity.DepartmentEntity;
import com.entity.DopinfoEntity;
import com.entity.EmployeesEntity;
import com.service.DepartmentService;
import com.service.DopinfoService;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DopinfoService dopinfoService;

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/showEmployee")
    public String showAllEmployee(Model model) {

        List<EmployeesEntity> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/showDopinfo")
    public String showDopinfo(Model model){
       List<DopinfoEntity> allDopinfo = dopinfoService.getAllInfo();
       model.addAttribute("allDopinfo", allDopinfo);
       return "all-dopinfo";
    }
    @RequestMapping("/showDepartments")
    public String showDepartments(Model model){
        List<DepartmentEntity> allDepartments = departmentService.getAllDepartments();
        model.addAttribute("allDepartments", allDepartments);
        return "all-departments";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        EmployeesEntity employee = new EmployeesEntity();
        model.addAttribute("employee", employee);

        return "add-employee";
    }

        @RequestMapping("/addNewDopinfo")
        public String addNewDopinfo(Model model) {
            DopinfoEntity dopinfo = new DopinfoEntity();
            model.addAttribute("dopinfo", dopinfo);

            return "add-dopinfo";
    }

    @RequestMapping("/addNewDepartment")
    public String addNewDepartment(Model model) {
        DepartmentEntity department = new DepartmentEntity();
        model.addAttribute("department", department);

        return "add-department";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("dopinfo")EmployeesEntity employees){
        employeeService.saveEmployee(employees);
        return "redirect:/showEmployee";
    }


    @RequestMapping("/saveDopinfo")
    public String saveDopinfo(@ModelAttribute("dopinfo")DopinfoEntity dopinfo){
        dopinfoService.saveDopinfo(dopinfo);
        return "redirect:/showDopinfo";
    }

    @RequestMapping("/saveDepartment")
    public String saveDepartment(@ModelAttribute("department") DepartmentEntity department){
        departmentService.saveDepartment(department);
        return "redirect:/showDepartments";
    }



}
