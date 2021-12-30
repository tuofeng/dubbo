package com.origin.service;

import com.origin.CallListener;
import com.origin.CallQueryProcess;
import com.origin.QueryInfo;
import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA
 *
 * @author: shaungfeng_li
 * @date: 2021/12/30 0030 13:39
 */
@Service(version = "callback")
public class CallBackQueryProcess
    implements CallQueryProcess {

    @Override
    public QueryInfo doQuery(String userId , CallListener callListener) {

        //回调consumer 11
        callListener.call(userId);

        return new QueryInfo(userId , "callback xmg");
    }

}