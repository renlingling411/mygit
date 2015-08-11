/*
*Project Name: common
* File Name: TmallLogisticsDetail.java
* Class Name: TmallLogisticsDetail
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

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallLogisticsDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    private String            taobaoLogisticsID;
    private String            time;
    private String            logisticsStatus;
    private String            logisticsCode;
    private String            logisticsRemark;
    private String            trunkInfo;
    private String            transportCode;
    private String            transportNumber;
    private String            wareHouse;

    public String getTaobaoLogisticsID() {
        return taobaoLogisticsID;
    }

    public void setTaobaoLogisticsID(String taobaoLogisticsID) {
        this.taobaoLogisticsID = taobaoLogisticsID;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getTransportCode() {
        return transportCode;
    }

    public void setTransportCode(String transportCode) {
        this.transportCode = transportCode;
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }

    public String getLogisticsRemark() {
        return logisticsRemark;
    }

    public void setLogisticsRemark(String logisticsRemark) {
        this.logisticsRemark = logisticsRemark;
    }

    /**
     * @param trunkInfo the trunkInfo to set
     */
    public void setTrunkInfo(String trunkInfo) {
        this.trunkInfo = trunkInfo;
    }

    /**
     * @return the trunkInfo
     */
    public String getTrunkInfo() {
        return trunkInfo;
    }

    /**
     * @param logisticsCode the logisticsCode to set
     */
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    /**
     * @return the logisticsCode
     */
    public String getLogisticsCode() {
        return logisticsCode;
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse;
    }
    
    
}
