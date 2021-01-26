package com.yqx.ureport.provider;

import com.yqx.ureport.service.UreportFileService;
import com.yqx.ureport.service.ViewUreportService;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Sql提供者
 */
@Setter
@Component
// prefix指向的路径就是 application.yaml文件中编写的内容 松散绑定
@ConfigurationProperties(prefix = "ureport.mysql.provider")
public class MySQLProvider {


    // 日志信息
    private final Logger logger = LoggerFactory.getLogger(getClass());
    // NAME属性
    private static final String NAME = "mysql-provider";
    // 未知
    private String perfix = "";
    // TODO 禁用?
    private boolean disabled;

    // 注入
    @Autowired
    private ViewUreportService viewUreportService;
    @Autowired
    private UreportFileService ureportFileService;
    @Autowired
    private HttpServletRequest request;









    public void setPerfix(String perfix) {
        this.perfix = perfix;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
