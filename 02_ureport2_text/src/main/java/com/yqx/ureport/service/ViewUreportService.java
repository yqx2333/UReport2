package com.yqx.ureport.service;

import com.yqx.ureport.pojo.ViewUreportEntity;

public interface ViewUreportService {

    // TODO 添加?
    int insertOne(ViewUreportEntity viewUreportEntity);

    // 根据id进行查询
    String queryNameById( String id );

}
