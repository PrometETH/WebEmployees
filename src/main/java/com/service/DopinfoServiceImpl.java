package com.service;

import com.jpaReposotory.DopinfoDAO;
import com.entity.DopinfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DopinfoServiceImpl implements DopinfoService{

    @Autowired
    private DopinfoDAO dopinfoDAO;

    @Override
    @Transactional
    public List<DopinfoEntity> getAllInfo() {
        return dopinfoDAO.getAllInfo();
    }

    @Override
    @Transactional
    public void saveDopinfo(DopinfoEntity dopinfo) {
        dopinfoDAO.saveDopinfo(dopinfo);
    }

}
