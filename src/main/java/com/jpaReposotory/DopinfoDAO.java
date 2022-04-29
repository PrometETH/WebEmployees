package com.jpaReposotory;

import com.entity.DopinfoEntity;

import java.util.List;

public interface DopinfoDAO {

    public List<DopinfoEntity> getAllInfo();

    public void saveDopinfo(DopinfoEntity dopinfo);



}
