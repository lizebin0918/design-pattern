package com.lzb.state.activity;

/**
 * 活动状态<br/>
 * Created on : 2021-11-07 21:33
 *
 * @author lizebin
 */
public enum ActivityStatus {

    /**
     * 1：编辑
     */
    EDIT(1, "编辑"),
    /**
     * 2：提审
     */
    ARRAIGNMENT(2, "提审"),
    /**
     * 3：撤审
     */
    REVOKE(3, "撤审"),
    /**
     * 4：通过
     */
    PASS(4, "通过"),
    /**
     * 5：运行(活动中)
     */
    DOING(5, "运行(活动中)"),
    /**
     * 6：拒绝
     */
    REFUSE(6, "拒绝"),
    /**
     * 7：关闭
     */
    CLOSE(7, "关闭"),
    /**
     * 8：开启
     */
    OPEN(8, "开启");

    private int code;
    private String text;

    ActivityStatus(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
