package com.lzb.state.activity;

import com.alibaba.fastjson.JSON;

/**
 * <br/>
 * Created on : 2021-11-11 08:37
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        IStateHandler stateHandler = new StateHandlerImpl();
        System.out.printf( "提交审核，测试：%s", JSON.toJSONString(stateHandler.arraignment(100001L, ActivityStatus.EDIT)));
        System.out.printf("审核通过，测试：%s", JSON.toJSONString(stateHandler.checkPass(100001L, ActivityStatus.ARRAIGNMENT)));
        System.out.printf("运行活动，测试：%s", JSON.toJSONString(stateHandler.doing(100001L, ActivityStatus.PASS)));
        System.out.printf("二次提审，测试：%s", JSON.toJSONString(stateHandler.checkPass(100001L, ActivityStatus.EDIT)));
    }
}
