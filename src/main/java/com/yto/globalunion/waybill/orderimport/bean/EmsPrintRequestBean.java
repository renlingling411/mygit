/*
*Project Name: common
* File Name: EmsPrintRequestBean.java
* Class Name: EmsPrintRequestBean
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

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * Description:ems 面单打印
 *
 * @author zhongyidong
 *
 */
public class EmsPrintRequestBean extends RequestBaseBean implements IMultiLanguageable{
    private static final long serialVersionUID = 1L;
    private String            langCode;
    private Boolean           isSuccess;
    private String            messages;
    private String            upstreamOrderId;

    /**
     * @return the upstreamOrderId
     */
    public String getUpstreamOrderId() {
        return upstreamOrderId;
    }

    /**
     * @param upstreamOrderId the upstreamOrderId to set
     */
    public void setUpstreamOrderId(String upstreamOrderId) {
        this.upstreamOrderId = upstreamOrderId;
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

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * @param langCode the langCode to set
     */
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

}
