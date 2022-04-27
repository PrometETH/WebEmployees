package com.service;

import com.entity.DepartmentEntity;

import java.util.List;

public interface DepartmentService {

    public List<DepartmentEntity> getAllDepartments();

    public void saveDepartment(DepartmentEntity department);

}
