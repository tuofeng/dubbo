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
public class TimeOut {

    /**
     * retries 重试次数
     */
    @Reference(version = "timeOut", timeout = 2000) //服务端执行5秒，客户端会报错
//    @Reference(version = "timeOut" ,timeout = 10000) 服务端执行5秒，不会报错
    private QueryProcess queryProcess;

    public String doQuery(String userId) {
        String s = queryProcess.doQuery(userId).toString();
        return s;
    }

}
