package com.google.gsjk.result;

/**
 * @program: user
 * @Description: recoder result information
 * @author: chun
 * @date: 2019/11/25 下午
 */
public class Result {
    private int resultcode;
    private String resultmessage;

    public Result() {
    }

    public Result(int resultcode,String resultmessage) {
        this.resultcode = resultcode;
        this.resultmessage = resultmessage;
    }

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultmessage() {
        return resultmessage;
    }

    public void setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
    }
}
