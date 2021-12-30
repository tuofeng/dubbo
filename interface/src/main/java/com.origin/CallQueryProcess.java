package com.origin;

/**
 * Created with IntelliJ IDEA
 *
 * @author: shaungfeng_li
 * @date: 2021/12/30 0030 13:40
 */
public interface CallQueryProcess {

    // 参数回调
    QueryInfo doQuery(String userId , CallListener callListener);

}