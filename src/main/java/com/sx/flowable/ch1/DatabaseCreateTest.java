package com.sx.flowable.ch1;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

public class DatabaseCreateTest {
    public static void main(String[] args) {

        StandaloneProcessEngineConfiguration standaloneProcessEngineConfiguration = new StandaloneProcessEngineConfiguration();

        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/flowable?useUnicode=true&characterEncoding=utf-8";
        standaloneProcessEngineConfiguration.setJdbcUrl(jdbcUrl);
        String jdbcDriver = "com.mysql.jdbc.Driver";
        standaloneProcessEngineConfiguration.setJdbcDriver(jdbcDriver);
        String jdbcUsername = "root";
        standaloneProcessEngineConfiguration.setJdbcUsername(jdbcUsername);
        String jdbcPassword = "root";
        standaloneProcessEngineConfiguration.setJdbcPassword(jdbcPassword);
        standaloneProcessEngineConfiguration.setDatabaseSchemaUpdate("true");


        ProcessEngine processEngine = standaloneProcessEngineConfiguration.buildProcessEngine();
//        System.out.println(processEngine);

    }
}
