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
 * 制定版本调用
 *
 * @author: shuangfeng_li 2021/12/28 17:08
 */
@Component
public class Mock {

    //@Reference(version = "mock" , mock = "force:return null")
    //@Reference(version = "mock" , mock = "true")   QueryProcess 同包下面有一个QueryProcessMock 实现了 QueryProcess接口
    @Reference(version = "mock", mock = "com.origin.service.MyMock")
    private QueryProcess queryProcess;

    public QueryInfo doQuery(String userId) {
        return queryProcess.doQuery(userId);
    }

}
