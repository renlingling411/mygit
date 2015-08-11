package com.yto.globalunion.bill.payorincome.entity;

/**
 * 
 * Description:
 *
 * @author wenhuiwang
 *
 */
public class EmsOrderSendJson {
//    "returnType":"error","returnValue":"sysno is null","returnMethodName":"awbGet","statusCode":"0001"
    
    private String returnType;
    private String returnValue;
    private String returnMethodName;
    private String statusCode;
    
    public String getReturnType() {
        return returnType;
    }
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
    public String getReturnValue() {
        return returnValue;
    }
    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }
    public String getReturnMethodName() {
        return returnMethodName;
    }
    public void setReturnMethodName(String returnMethodName) {
        this.returnMethodName = returnMethodName;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
}
