package com.jpaReposotory;

import com.entity.EmployeesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private final SessionFactory sessionFactory;

    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<EmployeesEntity> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        List<EmployeesEntity> allEmployees = session.createQuery("from EmployeesEntity", EmployeesEntity.class).getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(EmployeesEntity employees) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employees);
    }

    @Override
    public EmployeesEntity getEmpId(int id) {
        Session session = sessionFactory.getCurrentSession();

        EmployeesEntity employees = session.get(EmployeesEntity.class, id);
        return employees;

    }


}
