/*
*Project Name: common
* File Name: EmsPrintResponseBean.java
* Class Name: EmsPrintResponseBean
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
package com.yto.globalunion.waybill.orderimport.bean;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.BillInfo;

/**
 * Description: ems 面单打印
 *
 * @author zhongyidong
 *
 */
public class EmsPrintResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private BillInfo          billInfo;
    private Boolean           isSuccess;
    private String            messages;

    /**
     * @return the billInfo
     */
    public BillInfo getBillInfo() {
        return billInfo;
    }

    /**
     * @param billInfo the billInfo to set
     */
    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }

    /**
     * @return the isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * @param isSuccess the isSuccess to set
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(String messages) {
        this.messages = messages;
    }
}
