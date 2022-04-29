package com.service;


import com.jpaReposotory.DepartmentDAO;
import com.entity.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;


    @Override
    @Transactional
    public List<DepartmentEntity> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    @Override
    @Transactional
    public void saveDepartment(DepartmentEntity department) {
        departmentDAO.saveDepartment(department);
    }
}
