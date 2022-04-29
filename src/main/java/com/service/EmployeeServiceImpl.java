package com.service;

import com.jpaReposotory.EmployeeDAO;
import com.entity.EmployeesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<EmployeesEntity> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(EmployeesEntity employees) {
        employeeDAO.saveEmployee(employees);
    }

    @Override
    @Transactional
    public EmployeesEntity getEmpId(int id) {
        return employeeDAO.getEmpId(id);
    }
}
