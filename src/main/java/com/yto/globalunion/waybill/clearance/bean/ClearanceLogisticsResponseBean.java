/*
*Project Name: common
* File Name: ClearanceLogisticsResponseBean.java
* Class Name: ClearanceLogisticsResponseBean
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

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.BLCWayBill;

/**
 * Description:
 *
 * @author qianqianzhu
 *
 */
public class ClearanceLogisticsResponseBean extends ResponseBaseBean{

    private static final long serialVersionUID = 1L;
    private BLCWayBill                  bLCWayBill;
    private List<BLCWayBill>            bLCWayBills;
    private PagingBean<BLCWayBill>      pages;
    
    /**
     * @return the bLCWayBill
     */
    public BLCWayBill getbLCWayBill() {
        return bLCWayBill;
    }
    /**
     * @param bLCWayBill the bLCWayBill to set
     */
    public void setbLCWayBill(BLCWayBill bLCWayBill) {
        this.bLCWayBill = bLCWayBill;
    }
    /**
     * @return the bLCWayBills
     */
    public List<BLCWayBill> getbLCWayBills() {
        return bLCWayBills;
    }
    /**
     * @param bLCWayBills the bLCWayBills to set
     */
    public void setbLCWayBills(List<BLCWayBill> bLCWayBills) {
        this.bLCWayBills = bLCWayBills;
    }
    /**
     * @return the pages
     */
    public PagingBean<BLCWayBill> getPages() {
        return pages;
    }
    /**
     * @param pages the pages to set
     */
    public void setPages(PagingBean<BLCWayBill> pages) {
        this.pages = pages;
    }
    
    

}
