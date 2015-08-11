package com.yto.globalunion.basedata.company.entity;

import java.io.Serializable;

public class FieldCode implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String statusMapping;
    
    public String getStatusMapping() {
        return statusMapping;
    }
    public void setStatusMapping(String statusMapping) {
        this.statusMapping = statusMapping;
    }

}
