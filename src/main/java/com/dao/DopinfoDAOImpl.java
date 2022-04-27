package com.dao;

import com.entity.DopinfoEntity;
import com.entity.EmployeesEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DopinfoDAOImpl implements DopinfoDAO{

    private final SessionFactory sessionFactory;

    public DopinfoDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<DopinfoEntity> getAllInfo() {

        Session session = sessionFactory.getCurrentSession();
        List<DopinfoEntity> dopinfoEntities = session.createQuery("from DopinfoEntity", DopinfoEntity.class).getResultList();

        return dopinfoEntities;
    }

    @Override
    public void saveDopinfo(DopinfoEntity dopinfo) {
        Session session = sessionFactory.getCurrentSession();
        session.save(dopinfo);
    }


}
