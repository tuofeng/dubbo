package com.origin.service.call;

import com.origin.CallListener;

/**
 * Created with IntelliJ IDEA
 *
 * @author: shaungfeng_li
 * @date: 2021/12/30 0030 13:36
 */
public class MyCallListener implements CallListener {

    @Override
    public void call(String id) {
        System.out.println("被回调了" + id);
    }

}