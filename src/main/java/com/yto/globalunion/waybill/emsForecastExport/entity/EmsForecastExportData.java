/*
*Project Name: common
* File Name: EmsForecastExportData.java
* Class Name: EmsForecastExportData
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
package com.yto.globalunion.waybill.emsForecastExport.entity;

import java.io.Serializable;
import java.util.List;

import com.yto.globalunion.waybill.BillItem;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class EmsForecastExportData implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long              id;
    private String            upstreamCompanyOrderId;      // 上游公司运单号
    private String            upstreamCompanyCode;         // 上游公司id
    private String            upstreamCompanyName;         // 上游公司名称，经营单位
    private String            upstreamCompanyLogoName;
    private String            downstreamCompanyOrderId;    // 下游公司运单号
    private String            downstreamCompanyCode;       // 下游公司id
    private String            downstreamCompanyName;       // 下游公司名称
    
    private String            productCode;                 // 中文品名
    private String            batchId;                     // 总运单号
    private String            partId;                      // 分运单号
    
    private String            hsCoding;                    // HS编码
    private String            tenCoding;                   // 十位数编码
    private String            senderName;                  // 寄件人名称
    private String            senderNameTranslate;         // 寄件人名称翻译
    private String            senderPostCode;              // 寄件人邮政编码
    private String            senderPhone;                 // 寄件人联系电话
    private String            senderMobile;                // 寄件人手机号码
    private String            senderCountry;
    private String            senderCountryTranslate;
    private String            senderCountryCode;
    private String            senderCity;
    private String            senderCityTranslate;
    private String            senderCityCode;
    private String            senderAddress;
    private String            senderAddressTranslate;
    private String            senderAllAddressTranslate;
    
    private String            liaison;                     // 联系人
    private String            liaisonPhone;                // 联系方式
    
    private String            receiverName;                // 收件人名称
    private String            receiverNameTranslate;       // 收件人名称翻译
    private String            receiverPostCode;            // 收件人邮政编码
    private String            receiverPostcode7Dash;       // 速达7碼資料
    private String            receiverPhone;               // 收件人手机号码
    private String            receiverMobile;              // 收件人联系电话
    private String            receiverCountry;
    private String            receiverCountryTranslate;
    private String            receiverCountryCode;
    private String            receiverCity;
    private String            receiverCityTranslate;
    private String            receiverCityCode;
    private String            receiverAddress;
    private String            receiverAddressAfterPrint;   // 打印运单后生成的收件人地址
    private String            receiverAddressTranslate;
    private String            receiverAllAddressTranslate;
    
    private List<BillItem>    items;                       //内件列表
    private String            itemName;                    // 内件
    private int               itemNum;                     // 内件数量
    private Double            itemWeight;                  // 内件重量
    private Double            itemValue;                   // 内件价值
    private String            itemNameTranslate;           // 内件翻译名称
    private String            itemRemark;                  // 内件备注
    
    private String            reservedField01;             // 收件人部门名称
    private String            reservedField02;             // 收件人26108(未知字段)
    private String            reservedField03;             // 收件人大楼名称
    private String            reservedField04;             // 发件人部门名称
    private String            reservedField05;             // 内件数量
    private String            reservedField06;             // 品名(货物名称)
    private String            reservedField07;             // 航班号
    private String            reservedField08;             // 西浓订单标志位1(如果为1，则表示此运单为dat文件导入的西浓运单)
    private String            reservedField09;             // 货物价值
    private String            reservedField10;
    
    private Long              packSpecial;                 // 规格型号
    private String            packRemark;                  // 备注
    private String            packWeight;                  // 内件重量之和
    private int               packCount;                   // 包装数量
    private int               piecesCount;                 // 件数
    private String            goodsValue;                  // 价值
    private String            currencyCode;                // 价值单位，币种
    private String            material;                    // 材质
    private String            customsType;                 // 报关类别
    private String            measureUnit;                 // 计量单位
    private String            createDate;                  // 创建日期
    private String            sendDate;                    // 运单在上游公司传递过来的时间
    
    //用于条件查询
    private String            userCompany;                  // user的公司
    private String            startDate;                    //开始时间
    private String            endDate;                      //结束时间，用于查询
    
    private String            countryCode;                 // 收件人countryCode

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUpstreamCompanyOrderId() {
        return upstreamCompanyOrderId;
    }

    public void setUpstreamCompanyOrderId(String upstreamCompanyOrderId) {
        this.upstreamCompanyOrderId = upstreamCompanyOrderId;
    }

    public String getUpstreamCompanyCode() {
        return upstreamCompanyCode;
    }

    public void setUpstreamCompanyCode(String upstreamCompanyCode) {
        this.upstreamCompanyCode = upstreamCompanyCode;
    }

    public String getUpstreamCompanyName() {
        return upstreamCompanyName;
    }

    public void setUpstreamCompanyName(String upstreamCompanyName) {
        this.upstreamCompanyName = upstreamCompanyName;
    }

    public String getUpstreamCompanyLogoName() {
        return upstreamCompanyLogoName;
    }

    public void setUpstreamCompanyLogoName(String upstreamCompanyLogoName) {
        this.upstreamCompanyLogoName = upstreamCompanyLogoName;
    }

    public String getDownstreamCompanyOrderId() {
        return downstreamCompanyOrderId;
    }

    public void setDownstreamCompanyOrderId(String downstreamCompanyOrderId) {
        this.downstreamCompanyOrderId = downstreamCompanyOrderId;
    }

    public String getDownstreamCompanyCode() {
        return downstreamCompanyCode;
    }

    public void setDownstreamCompanyCode(String downstreamCompanyCode) {
        this.downstreamCompanyCode = downstreamCompanyCode;
    }

    public String getDownstreamCompanyName() {
        return downstreamCompanyName;
    }

    public void setDownstreamCompanyName(String downstreamCompanyName) {
        this.downstreamCompanyName = downstreamCompanyName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getHsCoding() {
        return hsCoding;
    }

    public void setHsCoding(String hsCoding) {
        this.hsCoding = hsCoding;
    }

    public String getTenCoding() {
        return tenCoding;
    }

    public void setTenCoding(String tenCoding) {
        this.tenCoding = tenCoding;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderNameTranslate() {
        return senderNameTranslate;
    }

    public void setSenderNameTranslate(String senderNameTranslate) {
        this.senderNameTranslate = senderNameTranslate;
    }

    public String getSenderPostCode() {
        return senderPostCode;
    }

    public void setSenderPostCode(String senderPostCode) {
        this.senderPostCode = senderPostCode;
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

    public String getSenderCountry() {
        return senderCountry;
    }

    public void setSenderCountry(String senderCountry) {
        this.senderCountry = senderCountry;
    }

    public String getSenderCountryTranslate() {
        return senderCountryTranslate;
    }

    public void setSenderCountryTranslate(String senderCountryTranslate) {
        this.senderCountryTranslate = senderCountryTranslate;
    }

    public String getSenderCountryCode() {
        return senderCountryCode;
    }

    public void setSenderCountryCode(String senderCountryCode) {
        this.senderCountryCode = senderCountryCode;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderCityTranslate() {
        return senderCityTranslate;
    }

    public void setSenderCityTranslate(String senderCityTranslate) {
        this.senderCityTranslate = senderCityTranslate;
    }

    public String getSenderCityCode() {
        return senderCityCode;
    }

    public void setSenderCityCode(String senderCityCode) {
        this.senderCityCode = senderCityCode;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddressTranslate() {
        return senderAddressTranslate;
    }

    public void setSenderAddressTranslate(String senderAddressTranslate) {
        this.senderAddressTranslate = senderAddressTranslate;
    }

    public String getSenderAllAddressTranslate() {
        return senderAllAddressTranslate;
    }

    public void setSenderAllAddressTranslate(String senderAllAddressTranslate) {
        this.senderAllAddressTranslate = senderAllAddressTranslate;
    }

    public String getLiaison() {
        return liaison;
    }

    public void setLiaison(String liaison) {
        this.liaison = liaison;
    }

    public String getLiaisonPhone() {
        return liaisonPhone;
    }

    public void setLiaisonPhone(String liaisonPhone) {
        this.liaisonPhone = liaisonPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverNameTranslate() {
        return receiverNameTranslate;
    }

    public void setReceiverNameTranslate(String receiverNameTranslate) {
        this.receiverNameTranslate = receiverNameTranslate;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverPostcode7Dash() {
        return receiverPostcode7Dash;
    }

    public void setReceiverPostcode7Dash(String receiverPostcode7Dash) {
        this.receiverPostcode7Dash = receiverPostcode7Dash;
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

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getReceiverCountryTranslate() {
        return receiverCountryTranslate;
    }

    public void setReceiverCountryTranslate(String receiverCountryTranslate) {
        this.receiverCountryTranslate = receiverCountryTranslate;
    }

    public String getReceiverCountryCode() {
        return receiverCountryCode;
    }

    public void setReceiverCountryCode(String receiverCountryCode) {
        this.receiverCountryCode = receiverCountryCode;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCityTranslate() {
        return receiverCityTranslate;
    }

    public void setReceiverCityTranslate(String receiverCityTranslate) {
        this.receiverCityTranslate = receiverCityTranslate;
    }

    public String getReceiverCityCode() {
        return receiverCityCode;
    }

    public void setReceiverCityCode(String receiverCityCode) {
        this.receiverCityCode = receiverCityCode;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddressAfterPrint() {
        return receiverAddressAfterPrint;
    }

    public void setReceiverAddressAfterPrint(String receiverAddressAfterPrint) {
        this.receiverAddressAfterPrint = receiverAddressAfterPrint;
    }

    public String getReceiverAddressTranslate() {
        return receiverAddressTranslate;
    }

    public void setReceiverAddressTranslate(String receiverAddressTranslate) {
        this.receiverAddressTranslate = receiverAddressTranslate;
    }

    public String getReceiverAllAddressTranslate() {
        return receiverAllAddressTranslate;
    }

    public void setReceiverAllAddressTranslate(String receiverAllAddressTranslate) {
        this.receiverAllAddressTranslate = receiverAllAddressTranslate;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Double getItemValue() {
        return itemValue;
    }

    public void setItemValue(Double itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemNameTranslate() {
        return itemNameTranslate;
    }

    public void setItemNameTranslate(String itemNameTranslate) {
        this.itemNameTranslate = itemNameTranslate;
    }

    public String getItemRemark() {
        return itemRemark;
    }

    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }

    public String getReservedField01() {
        return reservedField01;
    }

    public void setReservedField01(String reservedField01) {
        this.reservedField01 = reservedField01;
    }

    public String getReservedField02() {
        return reservedField02;
    }

    public void setReservedField02(String reservedField02) {
        this.reservedField02 = reservedField02;
    }

    public String getReservedField03() {
        return reservedField03;
    }

    public void setReservedField03(String reservedField03) {
        this.reservedField03 = reservedField03;
    }

    public String getReservedField04() {
        return reservedField04;
    }

    public void setReservedField04(String reservedField04) {
        this.reservedField04 = reservedField04;
    }

    public String getReservedField05() {
        return reservedField05;
    }

    public void setReservedField05(String reservedField05) {
        this.reservedField05 = reservedField05;
    }

    public String getReservedField06() {
        return reservedField06;
    }

    public void setReservedField06(String reservedField06) {
        this.reservedField06 = reservedField06;
    }

    public String getReservedField07() {
        return reservedField07;
    }

    public void setReservedField07(String reservedField07) {
        this.reservedField07 = reservedField07;
    }

    public String getReservedField08() {
        return reservedField08;
    }

    public void setReservedField08(String reservedField08) {
        this.reservedField08 = reservedField08;
    }

    public String getReservedField09() {
        return reservedField09;
    }

    public void setReservedField09(String reservedField09) {
        this.reservedField09 = reservedField09;
    }

    public String getReservedField10() {
        return reservedField10;
    }

    public void setReservedField10(String reservedField10) {
        this.reservedField10 = reservedField10;
    }

    public Long getPackSpecial() {
        return packSpecial;
    }

    public void setPackSpecial(Long packSpecial) {
        this.packSpecial = packSpecial;
    }

    public String getPackRemark() {
        return packRemark;
    }

    public void setPackRemark(String packRemark) {
        this.packRemark = packRemark;
    }

    public String getPackWeight() {
        return packWeight;
    }

    public void setPackWeight(String packWeight) {
        this.packWeight = packWeight;
    }

    public int getPackCount() {
        return packCount;
    }

    public void setPackCount(int packCount) {
        this.packCount = packCount;
    }

    public int getPiecesCount() {
        return piecesCount;
    }

    public void setPiecesCount(int piecesCount) {
        this.piecesCount = piecesCount;
    }

    public String getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCustomsType() {
        return customsType;
    }

    public void setCustomsType(String customsType) {
        this.customsType = customsType;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
