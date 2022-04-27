package com.service;

import com.dao.DopinfoDAO;
import com.entity.DopinfoEntity;
import com.entity.EmployeesEntity;

import java.util.List;

public interface DopinfoService {

    public List<DopinfoEntity> getAllInfo();

    public void saveDopinfo(DopinfoEntity dopinfo);


}
