package com.origin.service;

import com.origin.QueryInfo;
import org.apache.dubbo.config.annotation.Service;

import java.util.concurrent.CompletableFuture;

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
 * @author: shuangfeng_li 2021/12/29 14:52
 */
@Service(version = "async")
public class AsyncQueryProcess
        implements com.origin.AsyncQueryProcess {

    @Override
    public CompletableFuture<QueryInfo> doQuery(String userId) {
        System.out.println("执行了异步服务");

        return CompletableFuture.supplyAsync(() -> {
            return new QueryInfo(userId, "async xmg");
        });
    }

}
