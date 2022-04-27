package com.dao;

import com.entity.DepartmentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    private final SessionFactory sessionFactory;

    public DepartmentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<DepartmentEntity> getAllDepartments() {

        Session session = sessionFactory.getCurrentSession();
        List<DepartmentEntity> departmentEntities = session.createQuery("from DepartmentEntity ", DepartmentEntity.class).getResultList();

        return departmentEntities;
    }

    @Override
    public void saveDepartment(DepartmentEntity department) {
        Session session = sessionFactory.getCurrentSession();
        session.save(department);
    }
}
