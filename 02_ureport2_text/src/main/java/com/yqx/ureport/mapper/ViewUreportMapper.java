package com.yqx.ureport.mapper;

import com.yqx.ureport.pojo.ViewUreportEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewUreportMapper {

    // TODO 添加?
    int insertOne(ViewUreportEntity viewUreportEntity);

    // 根据id进行查询
    String queryNameById( String id );


}
