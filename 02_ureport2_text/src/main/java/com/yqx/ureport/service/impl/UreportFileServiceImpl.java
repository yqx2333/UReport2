package com.yqx.ureport.service.impl;

import com.yqx.ureport.mapper.UreportFileMapper;
import com.yqx.ureport.pojo.UreportFileEntity;
import com.yqx.ureport.service.UreportFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UreportFileServiceImpl implements UreportFileService {

    @Autowired
    private UreportFileMapper ureportFileMapper;


    /**
     * 根据 name 属性值查询总个数
     * @param name
     * @return
     */
    @Override
    public int checkExistByName(String name) {
        return ureportFileMapper.checkExistByName( name );
    }

    /**
     * 根据name属性值查询报表信息
     * @param name
     * @return
     */
    @Override
    public UreportFileEntity queryUreportFileEntityByName(String name) {
        return ureportFileMapper.queryUreportFileEntityByName( name );
    }

    /**
     * 查询所有报表信息
     * @return
     */
    @Override
    public List<UreportFileEntity> queryReportFileList() {
        return ureportFileMapper.queryReportFileList();
    }

    /**
     * 根据name属性值删除报表信息
     * @param name
     * @return
     */
    @Override
    public int deleteReportFileByName(String name) {
        return ureportFileMapper.deleteReportFileByName( name );
    }

    /**
     * 增加一条报表信息
     * @param ureportFileEntity
     * @return
     */
    @Override
    public int insertReportFile(UreportFileEntity ureportFileEntity) {
        return ureportFileMapper.insertReportFile( ureportFileEntity );
    }

    /**
     * 修改一条报表信息
     * @param ureportFileEntity
     * @return
     */
    @Override
    public int updateReoprtFile(UreportFileEntity ureportFileEntity) {
        return ureportFileMapper.updateReoprtFile( ureportFileEntity );
    }
}
