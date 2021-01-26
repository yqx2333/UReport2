package com.yqx.ureport.text;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * UReport2配置类
 */

@ImportResource( "classpath:ureport-console-context.xml" )
@EnableAutoConfiguration
@Configuration
@ComponentScan( basePackages = "com.yqx.ureport.text")
public class Ureport2Config {



}
