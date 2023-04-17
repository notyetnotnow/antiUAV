package com.hjl.learn.config;

import org.aopalliance.intercept.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
@MapperScan("com.hjl.learn.dao")
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
//        factoryBean.setTypeAliasesPackage("com.hjl.learn.domain");
//        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
//        // 开启驼峰命名  [mybatis 配置文件操作，settings 标签 配置 ]
//        config.setMapUnderscoreToCamelCase(true);
//        factoryBean.setConfiguration(config);
        return factoryBean;
    }

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.hjl.learn.dao");
//        return msc;
//    }
}
