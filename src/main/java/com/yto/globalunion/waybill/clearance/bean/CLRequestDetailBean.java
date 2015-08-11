/*
*Project Name: common
* File Name: CLRequestDetailBean.java
* Class Name: CLRequestDetailBean
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
package com.yto.globalunion.waybill.clearance.bean;

import java.io.Serializable;

/**
 * Description:
 *
 * @author qianqianzhu
 *
 */
public class CLRequestDetailBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    /**
     * 上游公司编号
     * 发货方公司在KK系统中的公司编号
     */
    private String            clientID;
    /**
     * 物流公司编号
     * 物流公司在KK系统中的公司编号
     */
    private String            logisticProviderID;
    /**
     * 清关公司编号
     * 清关公司在KK系统中的编号
     */
    private String            customsID;
    /**
     * 总运单号
     * 当时是为了区分这三层运单的情形(即有总运单、分运单、面单)，实际中一般只有总运单和运单，是两层结构。所以物流商一般只需指定总运单号和运单号即可
     */
    private String            totalLogisticsNo;
    /**
     * 物流企业运单号
     */
    private String            logisticsNo;
    
    /**
     * @return the clientID
     */
    public String getClientID() {
        return clientID;
    }
    /**
     * @param clientID the clientID to set
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    /**
     * @return the logisticProviderID
     */
    public String getLogisticProviderID() {
        return logisticProviderID;
    }
    /**
     * @param logisticProviderID the logisticProviderID to set
     */
    public void setLogisticProviderID(String logisticProviderID) {
        this.logisticProviderID = logisticProviderID;
    }
    /**
     * @return the customsID
     */
    public String getCustomsID() {
        return customsID;
    }
    /**
     * @param customsID the customsID to set
     */
    public void setCustomsID(String customsID) {
        this.customsID = customsID;
    }
    /**
     * @return the totalLogisticsNo
     */
    public String getTotalLogisticsNo() {
        return totalLogisticsNo;
    }
    /**
     * @param totalLogisticsNo the totalLogisticsNo to set
     */
    public void setTotalLogisticsNo(String totalLogisticsNo) {
        this.totalLogisticsNo = totalLogisticsNo;
    }
    /**
     * @return the logisticsNo
     */
    public String getLogisticsNo() {
        return logisticsNo;
    }
    /**
     * @param logisticsNo the logisticsNo to set
     */
    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }
    
}
