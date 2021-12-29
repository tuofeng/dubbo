package com.origin.service;

import com.origin.AsyncQueryProcess;
import com.origin.QueryInfo;
import org.apache.dubbo.config.annotation.Reference;

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
public class Async {


    @Reference(version = "async")
    private AsyncQueryProcess asyncQueryProcess;

    public String doQuery(String userId) {
        CompletableFuture<QueryInfo> completableFuture = asyncQueryProcess.doQuery(userId);
        completableFuture.whenComplete(new BiConsumer<QueryInfo, Throwable>() {
            @Override
            public void accept(QueryInfo queryInfo, Throwable throwable) {
                System.out.println("收到异步回调结果");
                System.out.println(queryInfo.toString());
            }
        });
        return "ok";
    }

}
