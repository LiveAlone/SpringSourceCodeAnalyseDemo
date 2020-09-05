package org.yqj.source.demo.application.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/5
 * Email: yaoqijunmail@foxmail.com
 */
@Component
@Slf4j
public class ComponentAChild extends ComponentA {

    @PostConstruct
    public void init() {
        log.info("********* component a child init, parent:{}", this);
    }

}
