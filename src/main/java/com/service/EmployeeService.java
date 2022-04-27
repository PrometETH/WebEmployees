package com.service;

import com.entity.EmployeesEntity;

import java.util.List;

public interface EmployeeService {

    public List<EmployeesEntity> getAllEmployees();

    public void saveEmployee(EmployeesEntity employees);

    public EmployeesEntity getEmpId(int id);
}
