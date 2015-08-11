/*
*Project Name: common
* File Name: InExportForecastDataResponseBean.java
* Class Name: InExportForecastDataResponseBean
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
import com.yto.globalunion.waybill.emsForecastExport.entity.EmsForecastExportData;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class EmsForecastExportDataResponseBean extends ResponseBaseBean {

    private static final long           serialVersionUID = 1L;

    private List<EmsForecastExportData> dataList;

    public List<EmsForecastExportData> getDataList() {
        return dataList;
    }

    public void setDataList(List<EmsForecastExportData> dataList) {
        this.dataList = dataList;
    }

}
