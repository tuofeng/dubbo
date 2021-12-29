package com.origin.service;

import com.origin.QueryInfo;
import com.origin.QueryProcess;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

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
 * 【
 * yml要配置一个rest协议
 * 其他 QueryProcess 接口要注释掉
 * 】
 *
 * @author: shuangfeng_li 2021/12/28 16:37
 */
@Path("test-rest")
@Service(protocol = "prot3")
public class RestfulQueryProcess
        implements QueryProcess {

    @GET
    @Path("doQuery")  //指定方法路径
    @Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})  //其他参数
    @Override
    public QueryInfo doQuery(String userId) {
        return new QueryInfo(userId, "ok");
    }

}
