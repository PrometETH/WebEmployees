package com.jpaReposotory;

import com.entity.DepartmentEntity;

import java.util.List;


public interface DepartmentDAO {

    public List<DepartmentEntity> getAllDepartments();

    public void saveDepartment(DepartmentEntity department);
}
