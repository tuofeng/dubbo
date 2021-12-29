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
public class MyStub
        implements QueryProcess {

    public QueryProcess queryProcess;

    public MyStub(QueryProcess queryProcess) {
        this.queryProcess = queryProcess;
    }

    public QueryInfo doQuery(String userId) {
        try {
            return queryProcess.doQuery(userId);
        } catch (Exception e) {
            return new QueryInfo(null, "error");
        }
    }

}
