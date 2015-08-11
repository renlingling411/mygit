/*
*Project Name: common
* File Name: TransportInfo.java
* Class Name: TransportInfo
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
package com.yto.globalunion.waybill.emsTransportInfo.entity;

import java.io.Serializable;

import com.yto.globalunion.waybill.emsTransportInfo.enums.EmsCountry;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TransportInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long              id;
    private String            transportNumber;      // 航班号
    private String            flightDate;           // 航班日期
    private String            billOrderNumber;      // 主运单号
    private String            exportPort;           // 出口口岸
    private String            inportPort;           // 进口口岸
    private String            expressName;          // 快递名称
    private EmsCountry        country;              // 国别
    private String            createTime;
    private String            startDate;             // 订单开始时间
    private String            endDate;               // 订单结束时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
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

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
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

}
