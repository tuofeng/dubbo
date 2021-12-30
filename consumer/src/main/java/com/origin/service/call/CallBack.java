package com.origin.service.call;

import com.origin.AsyncQueryProcess;
import com.origin.CallQueryProcess;
import com.origin.QueryInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

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
 * @author: shuangfeng_li 2021/12/29 14:51
 */
@Component
public class CallBack {

    @Reference(version = "callback")
    private CallQueryProcess callQueryProcess;

    public String doQuery(String userId) {
        return callQueryProcess.doQuery(userId , new MyCallListener()).toString();
    }

}
