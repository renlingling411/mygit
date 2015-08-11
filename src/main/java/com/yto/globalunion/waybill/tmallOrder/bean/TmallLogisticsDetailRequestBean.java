/*
*Project Name: common
* File Name: TmallLogisticsDetailRequestBean.java
* Class Name: TmallLogisticsDetailRequestBean
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
package com.yto.globalunion.waybill.tmallOrder.bean;

import java.util.Date;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.waybill.tmallOrder.entity.TmallLogisticsDetail;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallLogisticsDetailRequestBean extends RequestBaseBean {
    private static final long    serialVersionUID = 1L;
    private TmallLogisticsDetail logistics;
    private Date                 startDate;
    private Date                 endDate;

    public TmallLogisticsDetail getLogistics() {
        return logistics;
    }

    public void setLogistics(TmallLogisticsDetail logistics) {
        this.logistics = logistics;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
