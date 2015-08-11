/*
*Project Name: common
* File Name: TradeOrderDetail.java
* Class Name: TradeOrderDetail
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
package com.yto.globalunion.waybill.tmallOrder.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallOrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    private String            orderID;
    private double            tradeOrderValue;
    private String            tradeOrderRemark;
    private String            logisticsID;
    private String            wangwangId;
    private String            name;
    private String            phone;
    private String            mobile;
    private String            email;
    private String            country;
    private String            province;
    private String            city;
    private String            district;
    private String            streetAddress;
    private String            zipCode;
    private String            identityNumber;
    private String            receiverCode;
    private String            receiverWangWangId;
    private String            receiverName;
    private String            receiverPhone;
    private String            receiverMobile;
    private String            receiverEmail;
    private String            receiverCountry;
    private String            receiverProvince;
    private String            receiverCity;
    private String            receiverDistrict;
    private String            receiverStreetAddress;
    private String            receiverZipCode;
    private String            senderWangWangId;
    private String            senderName;
    private String            senderPhone;
    private String            senderMobile;
    private String            senderEmail;
    private String            senderCountry;
    private String            senderProvince;
    private String            senderCity;
    private String            senderDistrict;
    private String            senderStreetAddress;
    private String            senderZipCode;
    private String            code;
    private double            length;
    private double            width;
    private double            height;
    private double            logisticsWeight;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    private List<TmallOrderItem> items;

    public String getLogisticsID() {
        return logisticsID;
    }

    public void setLogisticsID(String logisticsID) {
        this.logisticsID = logisticsID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getWangwangId() {
        return wangwangId;
    }

    public void setWangwangId(String wangwangId) {
        this.wangwangId = wangwangId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public void setReceiverCode(String receiverCode) {
        this.receiverCode = receiverCode;
    }

    public String getReceiverWangWangId() {
        return receiverWangWangId;
    }

    public void setReceiverWangWangId(String receiverWangWangId) {
        this.receiverWangWangId = receiverWangWangId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
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

    public String getReceiverStreetAddress() {
        return receiverStreetAddress;
    }

    public void setReceiverStreetAddress(String receiverStreetAddress) {
        this.receiverStreetAddress = receiverStreetAddress;
    }

    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }

    public String getSenderWangWangId() {
        return senderWangWangId;
    }

    public void setSenderWangWangId(String senderWangWangId) {
        this.senderWangWangId = senderWangWangId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
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

    public String getSenderStreetAddress() {
        return senderStreetAddress;
    }

    public void setSenderStreetAddress(String senderStreetAddress) {
        this.senderStreetAddress = senderStreetAddress;
    }

    public String getSenderZipCode() {
        return senderZipCode;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }

    public List<TmallOrderItem> getItems() {
        return items;
    }

    public void setItems(List<TmallOrderItem> items) {
        this.items = items;
    }

    public double getTradeOrderValue() {
        return tradeOrderValue;
    }

    public void setTradeOrderValue(double tradeOrderValue) {
        this.tradeOrderValue = tradeOrderValue;
    }

    public String getTradeOrderRemark() {
        return tradeOrderRemark;
    }

    public void setTradeOrderRemark(String tradeOrderRemark) {
        this.tradeOrderRemark = tradeOrderRemark;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLogisticsWeight() {
        return logisticsWeight;
    }

    public void setLogisticsWeight(double logisticsWeight) {
        this.logisticsWeight = logisticsWeight;
    }
    
}
