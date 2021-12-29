package com.origin.controller;

import com.origin.QueryInfo;
import com.origin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
 * @author: shuangfeng_li 2021/12/28 16:39
 */
@RequestMapping("/demo")
@RestController
public class DemoController {

    @Autowired
    private Version version;

    @Autowired
    private Loadbalance loadbalance;

    @Autowired
    private TimeOut timeOut;

    @Autowired
    private Mock mock;

    @Autowired
    private Stub stub;

    @RequestMapping("/versionQuery")
    public String defaultQuery(@RequestParam("id") String userId) {
        return version.doQuery(userId);
    }

    @RequestMapping("/loadbalanceQuery")
    public String loadbalanceQuery(@RequestParam("id") String userId) {
        return loadbalance.doQuery(userId);
    }

    @RequestMapping("/timeOutQuery")
    public String timeOutQuery(@RequestParam("id") String userId) {
        return timeOut.doQuery(userId);
    }

    @RequestMapping("/mockQuery")
    public String mockQuery(@RequestParam("id") String userId) {
        QueryInfo queryInfo = mock.doQuery(userId);
        if (queryInfo != null) {
            return queryInfo.toString();
        }
        return "null";
    }

    @RequestMapping("/stubQuery")
    public String stubQuery(@RequestParam("id") String userId) {
        QueryInfo queryInfo = stub.doQuery(userId);
        if (queryInfo != null) {
            return queryInfo.toString();
        }
        return "null";
    }

}
