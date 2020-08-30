package org.yqj.source.demo.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/8/30
 * Email: yaoqijunmail@foxmail.com
 */
@Slf4j
public class LocalApplicationRunnerListener implements SpringApplicationRunListener {

    public LocalApplicationRunnerListener(SpringApplication springApplication, String[] args) {
    }

    @Override
    public void starting() {
        log.info(" ** local application is starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        log.info(" ** local application environmentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info(" ** local application contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info(" ** local application contextLoaded");

    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        log.info(" ** local application started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        log.info(" ** local application running");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info(" ** local application failed");
    }
}
