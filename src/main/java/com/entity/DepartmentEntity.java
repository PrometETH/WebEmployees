package com.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_department")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<EmployeesEntity> employees;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeesEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeesEntity> employees) {
        this.employees = employees;
    }

    public void addEmployeeToDepartment(EmployeesEntity employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
        employee.setDepartment(this);

    }

    @Override
    public String toString() {
        return "id - " + id;
    }
}
