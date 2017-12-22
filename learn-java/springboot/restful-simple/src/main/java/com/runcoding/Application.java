package com.runcoding;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat(jetty) 并初始化 Spring 环境及其各 Spring 组件
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        //SpringApplication.run(Application.class,args);
    }
}
