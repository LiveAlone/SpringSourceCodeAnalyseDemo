package org.yqj.source.demo.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/1
 * Email: yaoqijunmail@foxmail.com
 */
@Slf4j
public class LocalApplicationListener implements ApplicationListener<ApplicationEvent> {



    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        log.info("********** spring application listener get event is " + event);
    }
}
