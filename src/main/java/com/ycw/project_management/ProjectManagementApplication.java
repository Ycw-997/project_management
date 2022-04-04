package com.ycw.project_management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProjectManagementApplication {
    private static final Logger LOG = LoggerFactory.getLogger(ProjectManagementApplication.class);//打印出日制信息所在的类

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProjectManagementApplication.class);//重写底层
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
