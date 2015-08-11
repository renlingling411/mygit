/**
 * 
 */
package com.yto.globalunion.common.entity;

import java.io.Serializable;
import java.util.List;

import com.yto.globalunion.common.enums.Functions;

/**
 *权限实体类
 * @author penglan
 */
public class Function implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            functionCode;
    private String            functionClass;
    private Integer           functionOrder;
    private Long              functionParentId;
    private String            functionIcon;
    private Boolean           functionIsMenu;
    private String            functionName;
    private String            langCode;
    private List<Function>    subFunctions;
    private Functions         functions;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the functionCode
     */
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * @param functionCode the functionCode to set
     */
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
        this.functions = Functions.getFunctions(functionCode);
    }

    /**
     * @return the functionClass
     */
    public String getFunctionClass() {
        return functionClass;
    }

    /**
     * @param functionClass the functionClass to set
     */
    public void setFunctionClass(String functionClass) {
        this.functionClass = functionClass;
    }

    /**
     * @return the function_order
     */
    public Integer getFunctionOrder() {
        return functionOrder;
    }

    /**
     * @param function_order the function_order to set
     */
    public void setFunctionOrder(Integer functionOrder) {
        this.functionOrder = functionOrder;
    }

    /**
     * @return the functionParentId
     */
    public Long getFunctionParentId() {
        return functionParentId;
    }

    /**
     * @param functionParentId the functionParentId to set
     */
    public void setFunctionParentId(Long functionParentId) {
        this.functionParentId = functionParentId;
    }

    /**
     * @return the functionIcon
     */
    public String getFunctionIcon() {
        return functionIcon;
    }

    /**
     * @param functionIcon the functionIcon to set
     */
    public void setFunctionIcon(String functionIcon) {
        this.functionIcon = functionIcon;
    }

    /**
     * @return the functionIsMenu
     */
    public Boolean getFunctionIsMenu() {
        return functionIsMenu;
    }

    /**
     * @param functionIsMenu the functionIsMenu to set
     */
    public void setFunctionIsMenu(Boolean functionIsMenu) {
        this.functionIsMenu = functionIsMenu;
    }

    /**
     * @return the functionName
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * @param functionName the functionName to set
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    /**
     * @return the subFunctions
     */
    public List<Function> getSubFunctions() {
        return subFunctions;
    }

    /**
     * @param subFunctions the subFunctions to set
     */
    public void setSubFunctions(List<Function> subFunctions) {
        this.subFunctions = subFunctions;
    }

    /**
     * @return the functions
     */
    public Functions getFunctions() {
        return functions;
    }

}
