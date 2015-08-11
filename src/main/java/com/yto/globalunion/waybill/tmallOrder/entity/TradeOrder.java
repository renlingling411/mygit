/*
*Project Name: common
* File Name: TradeOrder.java
* Class Name: TradeOrder
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
 * Description:Trade order response bean between Cj Tmall 
 *
 * @author bx
 *
 */
public class TradeOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    public String tradeID;
    public String logistics;
    public String tradeStatus;
    public String logisticsStatus;
    public String carrierCode;
    public String logisticsID;

    
    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public String getTradeID() {
        return tradeID;
    }

    public void setTradeID(String tradeID) {
        this.tradeID = tradeID;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getLogisticsID() {
        return logisticsID;
    }

    public void setLogisticsID(String logisticsID) {
        this.logisticsID = logisticsID;
    }

}
