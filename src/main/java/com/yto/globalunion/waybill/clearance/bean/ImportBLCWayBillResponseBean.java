/*
*Project Name: common
* File Name: ImportBLCWayBillResponseBean.java
* Class Name: ImportBLCWayBillResponseBean
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

import java.util.List;

import com.yto.globalunion.common.bean.ErrorDetailBean;
import com.yto.globalunion.common.bean.ExcelImportResponseBean;
import com.yto.globalunion.common.bean.INewJobResponse;
import com.yto.globalunion.common.bean.IRequest;
import com.yto.globalunion.waybill.BLCWayBill;

/**
 * Description:
 *
 * @author qianqianzhu
 *
 */
public class ImportBLCWayBillResponseBean extends ExcelImportResponseBean implements INewJobResponse {

    private static final long     serialVersionUID = 1L;

    private List<BLCWayBill>        list;

    private List<ErrorDetailBean> errorDetailBeans;

    private IRequest[]            jobRequests;

    /**
     * @return the list
     */
    public List<BLCWayBill> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BLCWayBill> list) {
        this.list = list;
    }

    /**
     * @return the errorDetailBeans
     */
    public List<ErrorDetailBean> getErrorDetailBeans() {
        return errorDetailBeans;
    }

    /**
     * @param errorDetailBeans the errorDetailBeans to set
     */
    public void setErrorDetailBeans(List<ErrorDetailBean> errorDetailBeans) {
        this.errorDetailBeans = errorDetailBeans;
    }

    /**
     * @return the jobRequests
     */
    public IRequest[] getJobRequests() {
        return jobRequests;
    }

    /**
     * @param jobRequests the jobRequests to set
     */
    public void setJobRequests(IRequest[] jobRequests) {
        this.jobRequests = jobRequests;
    }
    
    

}
