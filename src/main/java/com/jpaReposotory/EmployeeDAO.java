package com.jpaReposotory;

import com.entity.EmployeesEntity;

import java.util.List;

public interface EmployeeDAO {

    public List<EmployeesEntity> getAllEmployees();

   public void saveEmployee(EmployeesEntity employees);

   public EmployeesEntity getEmpId(int id);
}
