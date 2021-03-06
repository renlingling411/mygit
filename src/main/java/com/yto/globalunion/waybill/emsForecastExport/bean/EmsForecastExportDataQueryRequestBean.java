/*
*Project Name: common
* File Name: EmsForecastExportDataQueryRequestBean.java
* Class Name: EmsForecastExportDataQueryRequestBean
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
package com.yto.globalunion.waybill.emsForecastExport.bean;


import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.emsForecastExport.entity.EmsForecastExportData;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class EmsForecastExportDataQueryRequestBean extends RequestBaseBean implements IMultiLanguageable {

    private static final long serialVersionUID = 1L;
    private String                            langCode;
    private PagingBean<EmsForecastExportData> page;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public PagingBean<EmsForecastExportData> getPage() {
        return page;
    }

    public void setPage(PagingBean<EmsForecastExportData> page) {
        this.page = page;
    }
    
    
}
