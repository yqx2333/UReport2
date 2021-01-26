package com.yqx.ureport.service.impl;

import com.yqx.ureport.mapper.ViewUreportMapper;
import com.yqx.ureport.pojo.ViewUreportEntity;
import com.yqx.ureport.service.ViewUreportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewUreportServiceImpl implements ViewUreportService {

    @Autowired
    private ViewUreportMapper viewUreportMapper;

    @Override
    public int insertOne(ViewUreportEntity viewUreportEntity) {
        return viewUreportMapper.insertOne( viewUreportEntity );
    }

    @Override
    public String queryNameById(String id) {
        return viewUreportMapper.queryNameById( id );
    }
}
