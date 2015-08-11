/*
*Project Name: common
* File Name: OrderInfoDetail.java
* Class Name: OrderInfoDetail
*
* Copyright 2014 Hengtian Software Inc
*
* Licensed under the Hengtiansoft
*
* http://www.hengtiansoft.com
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
* implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.yto.globalunion.waybill.orderimport.entity;

import java.io.Serializable;
import java.util.List;

import com.yto.globalunion.waybill.BillItem;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class OrderInfoDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long              id;
    // 上游公司名称
    private String            upstreamCompanyName;
    // 上游公司id
    private String            upstreamCompanyCode;
    // 上游公司运单号
    private String            upstreamCompanyOrderId;

    // 下游公司名称
    private String            downstreamCompanyName;
    // 下游公司id
    private String            downstreamCompanyCode;
    // 下游公司运单号
    private String            downstreamCompanyOrderId;
    // 起始时间
    private String            startDate;
    // 截止时间
    private String            endDate;

    // 寄件人姓名
    private String            senderName;
    // 寄件人邮政编码
    private String            senderPostCode;
    // 寄件人电话
    private String            senderPhone;
    // 寄件人手机
    private String            senderMobile;
    // 寄件人国家
    private String            senderCountry;
    // 寄件人省份
    private String            senderProvince;
    // 寄件人国家
    private String            senderCity;
    // 寄件人区域
    private String            senderDistrict;
    // 寄件人地址
    private String            senderAddress;

    // 收件人姓名
    private String            receiverName;
    // 收件人邮政编码
    private String            receiverPostCode;
    // 收件人电话
    private String            receiverPhone;
    // 收件人手机
    private String            receiverMobile;

    // 收件人国家
    private String            receiverCountry;
    // 收件人省份
    private String            receiverProvince;
    // 收件人国家
    private String            receiverCity;
    // 收件人区域
    private String            receiverDistrict;
    // 收件人地址
    private String            receiverAddress;

    // 发送时间
    private String            sendDate;
    // 创建时间
    private String            createDate;
    // 修改时间
    private String            modifyDate;

    // 是否已分配
    private Boolean           isAssigned;
    // 翻译状态
    private String            translateStateCode;
    // 是否已经发送，默认为未发送
    private String            isSended         = "N";

    // 重量
    private Double            packWeight;
    // 重量单位
    private String            packWeightUnit;

    private List<BillItem>    billItems;
    
    private Long[]            itemIds;
    private String[]          itemNames;
    private int[]             itemNums;
    private Double[]          itemValues;
    private Double[]          itemWeights;
    private String[]          itemRemarks;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return upStreamCompanyName
     */
    public String getUpstreamCompanyName() {
        return upstreamCompanyName;
    }

    /**
     * 
     * @param upStreamCompanyName
     */
    public void setUpstreamCompanyName(String upstreamCompanyName) {
        this.upstreamCompanyName = upstreamCompanyName;
    }

    /**
     * 
     * @return upstreamCompanyCode
     */
    public String getUpstreamCompanyCode() {
        return upstreamCompanyCode;
    }

    /**
     * 
     * @param upstreamCompanyCode
     */
    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    /**
     *  
     * @return upStreamCompanyOrderId
     */
    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    /**
     * 
     * @param upStreamCompanyOrderId
     */
    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    /**
     * 
     * @return downstreamCompanyName
     */
    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    /**
     * 
     * @param downstreamCompanyName
     */
    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
    }

    /**
     * 
     * @return downstreamCompanyCode
     */
    public String getDownstreamCompanyCode() {
        return downstreamCompanyCode;
    }

    /**
     * 
     * @param downstreamCompanyCode
     */
    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
    }

    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPostCode() {
        return senderPostCode;
    }

    public void setSenderPostCode(String senderPostCode) {
        this.senderPostCode = senderPostCode;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getSenderProvince() {
        return senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderDistrict() {
        return senderDistrict;
    }

    public void setSenderDistrict(String senderDistrict) {
        this.senderDistrict = senderDistrict;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    public String getTranslateStateCode() {
        return translateStateCode;
    }

    public void setTranslateStateCode(String translateStateCode) {
        this.translateStateCode = translateStateCode;
    }

    public String getIsSended() {
        return isSended;
    }

    public void setIsSended(String isSended) {
        this.isSended = isSended;
    }

    public Double getPackWeight() {
        return packWeight;
    }

    public void setPackWeight(Double packWeight) {
        this.packWeight = packWeight;
    }

    public String getPackWeightUnit() {
        return packWeightUnit;
    }

    public void setPackWeightUnit(String packWeightUnit) {
        this.packWeightUnit = packWeightUnit;
    }

    public List<BillItem> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<BillItem> billItems) {
        this.billItems = billItems;
    }

    public Long[] getItemIds() {
        return itemIds;
    }

    public void setItemIds(Long[] itemIds) {
        this.itemIds = itemIds;
    }

    public String[] getItemNames() {
        return itemNames;
    }

    public void setItemNames(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public int[] getItemNums() {
        return itemNums;
    }

    public void setItemNums(int[] itemNums) {
        this.itemNums = itemNums;
    }

    public Double[] getItemValues() {
        return itemValues;
    }

    public void setItemValues(Double[] itemValues) {
        this.itemValues = itemValues;
    }

    public Double[] getItemWeights() {
        return itemWeights;
    }

    public void setItemWeights(Double[] itemWeights) {
        this.itemWeights = itemWeights;
    }

    public String[] getItemRemarks() {
        return itemRemarks;
    }

    public void setItemRemarks(String[] itemRemarks) {
        this.itemRemarks = itemRemarks;
    }

}
