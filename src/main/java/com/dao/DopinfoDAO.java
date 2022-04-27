package com.dao;

import com.entity.DopinfoEntity;
import com.entity.EmployeesEntity;

import java.util.List;

public interface DopinfoDAO {

    public List<DopinfoEntity> getAllInfo();

    public void saveDopinfo(DopinfoEntity dopinfo);



}
