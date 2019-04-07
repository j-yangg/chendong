package org.cd.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @classname: TestUser
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-07 22:05
 */
@RefreshScope
@Component
public class TestUser {

    @Value("${test.message}")
    private String testMsg;

    public String getTestMsg() {
        return testMsg;
    }

    public void setTestMsg(String testMsg) {
        this.testMsg = testMsg;
    }
}
