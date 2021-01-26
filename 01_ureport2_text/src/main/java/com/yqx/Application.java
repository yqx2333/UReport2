package com.yqx;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication	// 启动类
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	// 添加UReport2到Servlet
	@Bean
	public ServletRegistrationBean buildReportServlet(){
		// /ureport/*    访问该路径下所有的文件
		return new ServletRegistrationBean( new UReportServlet(),"/ureport/*")
	}

}
