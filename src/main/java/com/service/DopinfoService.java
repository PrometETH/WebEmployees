package com.service;

import com.entity.DopinfoEntity;

import java.util.List;

public interface DopinfoService {

    public List<DopinfoEntity> getAllInfo();

    public void saveDopinfo(DopinfoEntity dopinfo);


}
