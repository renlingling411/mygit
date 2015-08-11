/*
*Project Name: common
* File Name: EmsFlightOrderInfo.java
* Class Name: EmsFlightOrderInfo
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
package com.yto.globalunion.bill.payorincome.entity;

import java.io.Serializable;

import com.yto.globalunion.waybill.emsTransportInfo.enums.EmsCountry;

/**
 * Description:
 * SHEMS航班信息和运单信息
 * @author dongdongliu
 *
 */
public class EmsFlightOrderInfo implements Serializable {
    private static final long serialVersionUID = 4736222364460422190L;
    private Long              id;                                      // 订单表主键
    private String            upStreamOrderId;                        // 上游公司订单
    private String            downStreamOrderId;                      // 下游公司订单
    private String            upStreamCompanyCode;                    // 上游公司编号
    private String            downStreamCompanyCode;                  // 下游公司编号
    private String            receiverCountry;                        // 收件人国别
    private String            sendDate;                               // 订单创建时间（来源）
    private String            reservedField01;                        // 备用字段1（存放台湾件的EMS订单号）
    private String            transportNumber;                        // 航班号
    private String            flightDate;                             // 航班日期
    private String            billOrderNumber;                        // 主运单号
    private String            exportPort;                             // 出口口岸
    private String            inportPort;                             // 进口口岸
    private String            expressName;                            // 快递名称
    private EmsCountry        country;                                // 国别
    private String            createTime;
    private String            startDate;                              // 订单开始时间
    private String            endDate;                                // 订单结束时间

    public String getUpStreamOrderId() {
        return upStreamOrderId;
    }

    public void setUpStreamOrderId(String upStreamOrderId) {
        this.upStreamOrderId = upStreamOrderId;
    }

    public String getDownStreamOrderId() {
        return downStreamOrderId;
    }

    public void setDownStreamOrderId(String downStreamOrderId) {
        this.downStreamOrderId = downStreamOrderId;
    }

    public String getUpStreamCompanyCode() {
        return upStreamCompanyCode;
    }

    public void setUpStreamCompanyCode(String upStreamCompanyCode) {
        this.upStreamCompanyCode = upStreamCompanyCode;
    }

    public String getDownStreamCompanyCode() {
        return downStreamCompanyCode;
    }

    public void setDownStreamCompanyCode(String downStreamCompanyCode) {
        this.downStreamCompanyCode = downStreamCompanyCode;
    }

    public String getReceiverCountry() {
        return receiverCountry;
    }

    public void setReceiverCountry(String receiverCountry) {
        this.receiverCountry = receiverCountry;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getBillOrderNumber() {
        return billOrderNumber;
    }

    public void setBillOrderNumber(String billOrderNumber) {
        this.billOrderNumber = billOrderNumber;
    }

    public String getExportPort() {
        return exportPort;
    }

    public void setExportPort(String exportPort) {
        this.exportPort = exportPort;
    }

    public String getInportPort() {
        return inportPort;
    }

    public void setInportPort(String inportPort) {
        this.inportPort = inportPort;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public EmsCountry getCountry() {
        return country;
    }

    public void setCountry(EmsCountry country) {
        this.country = country;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getReservedField01() {
        return reservedField01;
    }

    public void setReservedField01(String reservedField01) {
        this.reservedField01 = reservedField01;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
