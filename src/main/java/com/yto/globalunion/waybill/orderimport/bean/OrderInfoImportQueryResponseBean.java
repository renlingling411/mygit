/*
*Project Name: common
* File Name: OrderInfoImportResponseBean.java
* Class Name: OrderInfoImportResponseBean
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
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.BillItem;
import com.yto.globalunion.waybill.orderimport.entity.OrderInfoDetail;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class OrderInfoImportQueryResponseBean  extends ResponseBaseBean{
    
    private static final long               serialVersionUID = 1L;
    // 分页信息
    private PagingBean<OrderInfoDetail>     page;
    private PagingBean<BillItem>            itemPage;

    /**
     * @return the page
     */
    public PagingBean<OrderInfoDetail> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<OrderInfoDetail> page) {
        this.page = page;
    }

    public PagingBean<BillItem> getItemPage() {
        return itemPage;
    }

    public void setItemPage(PagingBean<BillItem> itemPage) {
        this.itemPage = itemPage;
    }
    

}
