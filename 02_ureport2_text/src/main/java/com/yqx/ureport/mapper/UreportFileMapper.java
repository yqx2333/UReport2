package com.yqx.ureport.mapper;

import com.yqx.ureport.pojo.UreportFileEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UreportFileMapper{

    /**
     * 根据name属性检查报表是否存在
     * @param name
     * @return
     */
    int checkExistByName( String name );

    /**
     * 根据报表名称name查询报表信息
     * @param name
     * @return
     */
    UreportFileEntity queryUreportFileEntityByName( String name );

    /**
     * 查询所有报表信息
     * @return
     */
    List<UreportFileEntity> queryReportFileList();

    /**
     * 根据报表名称   进行删除报表对象
     * @param name
     * @return
     */
    int deleteReportFileByName( String name );

    /**
     * 根据UreportFileEntity添加一个对象,增加功能
     * @param ureportFileEntity
     * @return
     */
    int insertReportFile( UreportFileEntity ureportFileEntity );

    /**
     * 根据UreportFileEntity对象 进行修改功能
     * @param ureportFileEntity
     * @return
     */
    int updateReoprtFile( UreportFileEntity ureportFileEntity );



}
