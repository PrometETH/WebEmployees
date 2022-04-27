package com.dao;

import com.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentDAO {

    public List<DepartmentEntity> getAllDepartments();

    public void saveDepartment(DepartmentEntity department);
}
