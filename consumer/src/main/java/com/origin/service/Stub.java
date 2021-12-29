package com.origin.service;

import com.origin.QueryInfo;
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
 *
 * @author: shuangfeng_li 2021/12/29 14:16
 */
@Component
public class Stub {

    //@Reference(version = "default" , stub = "true") QueryProcess 同包下面有一个QueryProcessStub 实现了 QueryProcess接口
    @Reference(version = "default", stub = "com.origin.service.MyStub")
    private QueryProcess queryProcess;

    public QueryInfo doQuery(String userId) {
        return queryProcess.doQuery(userId);
    }

}
