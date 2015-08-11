/*
*Project Name: common
* File Name: EmsForecastExportDataSearchResponseBean.java
* Class Name: EmsForecastExportDataSearchResponseBean
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

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.emsForecastExport.entity.EmsForecastExportData;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class EmsForecastExportDataQueryResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    private PagingBean<EmsForecastExportData> page;
    private List<EmsForecastExportData>       billList;
    
    public PagingBean<EmsForecastExportData> getPage() {
        return page;
    }
    public void setPage(PagingBean<EmsForecastExportData> page) {
        this.page = page;
    }
    public List<EmsForecastExportData> getBillList() {
        return billList;
    }
    public void setBillList(List<EmsForecastExportData> billList) {
        this.billList = billList;
    }
    
}
