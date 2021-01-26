package com.yqx.ureport.config;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component  // 组件
public class UReport2DataSource implements BuildinDatasource {

    // 设置不可变常量 NAME
    private static final String NAME = "MyDataSource";
    // 添加日志
    private Logger logger = LoggerFactory.getLogger(UReport2DataSource.class);


    // 注入DataSource
    @Autowired
    private DataSource dataSource;

    /**
     * 获取Name值  数据源名称
     * @return
     */
    @Override
    public String name() {
        return NAME;
    }

    /**
     *  获取数据库连接
     * @return
     */
    @Override
    public Connection getConnection() {

        try {
            // 获取数据库连接
            return dataSource.getConnection();
        } catch ( SQLException e ) {
            logger.error( "UReport2 数据源获取失败" );
            e.printStackTrace();
        }

        return null;
    }
}
