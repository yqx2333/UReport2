package com.yqx.ureport.text;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

/**
 * UReport2配置类
 */

// @ImportResource 用于将xml文件加载到Spring配置文件中
@ImportResource( "classpath:ureport-console-context.xml" )
@EnableAutoConfiguration
@Configuration
@ComponentScan( basePackages = "com.yqx.ureport.text")
public class Ureport2Config {

    // 注入Bean,将UReport2加载到Servlet对象中
    @Bean
    public ServletRegistrationBean<Servlet> buildUreportServlet(){
        return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
    }

}
