package com.yto.globalunion.bill.payorincome.entity;

import java.util.List;


public class EmsOrderJson  {
    
    private String returnType;
    private List<EmsOrderOriInfo> returnValue;
    
    public String getReturnType() {
        return returnType;
    }
    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
    public List<EmsOrderOriInfo> getReturnValue() {
        return returnValue;
    }
    public void setReturnValue(List<EmsOrderOriInfo> returnValue) {
        this.returnValue = returnValue;
    }
    
}
