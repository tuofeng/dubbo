package com.origin.service;

import com.origin.QueryProcess;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * _ooOoo_
 * o8888888o
 * 88" . "88
 * (| -_- |)
 * O\ = /O
 * ___/`---'\____
 * .   ' \\| |// `.
 * / \\||| : |||// \
 * / _||||| -:- |||||- \
 * | | \\\ - /// | |
 * | \_| ''\---/'' | |
 * \ .-\__ `-` ___/-. /
 * ___`. .' /--.--\ `. . __
 * ."" '< `.___\_<|>_/___.' >'"".
 * | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 * 制定版本调用
 *
 * @author: shuangfeng_li 2021/12/28 17:08
 */
@Component
public class Version {

    /**
     * retries 重试次数
     * failfast 快速失败，只发起一次调用，失败立即报错
     */
    @Reference(version = "default" , retries = 2 , cluster = "failfast")
    private QueryProcess queryProcess;

    public String doQuery(String userId) {
        return queryProcess.doQuery(userId).toString();
    }

}
