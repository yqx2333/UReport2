package com.yqx.ureport.mapper;

import com.yqx.ureport.pojo.UreportFileEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UreportFileMapper extends tk.mybatis.mapper.common.Mapper<UreportFileMapper> {

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

    /**
     * 根据ID进行删除对象.
     * @param id
     */
    void deleteReportFile( Integer id );

}
