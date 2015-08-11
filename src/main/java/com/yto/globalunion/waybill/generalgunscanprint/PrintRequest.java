/*
*Project Name: common
* File Name: PrintResponse.java
* Class Name: PrintResponse
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
package com.yto.globalunion.waybill.generalgunscanprint;

import java.io.Serializable;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * Description:
 *
 * @author dongdongliu
 *
 */
public class PrintRequest extends RequestBaseBean implements IMultiLanguageable, Serializable {

    private static final long serialVersionUID = 2928719967009545317L;
    private String            orderId;
    private String            companyCode;
    private String            langCode;

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getLangCode() {
        return langCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
