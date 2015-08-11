/*
*Project Name: common
* File Name: OrderInfoImportQueryRequestBean.java
* Class Name: OrderInfoImportQueryRequestBean
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
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.BillItem;
import com.yto.globalunion.waybill.orderimport.entity.OrderInfoDetail;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class OrderInfoImportQueryRequestBean extends RequestBaseBean implements IMultiLanguageable{
    private static final long               serialVersionUID = 1L;
    // 语言代码
    private String                          langCode;
    // 分页信息
    private PagingBean<OrderInfoDetail>     page;
    // 运单信息
    private OrderInfoDetail                 orderInfo;
    // 运单id
    private String                          orderId;
    // 内件信息
    private PagingBean<BillItem>            itemPage;
    // 内件
    private BillItem                        orderItem;
    /**
     * 
     * @return langCode
     */
    public String getLangCode() {
        return langCode;
    }
    
    /**
     * @param langCode
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
    /**
     * 
     * @return page
     */
    public PagingBean<OrderInfoDetail> getPage() {
        return page;
    }
    /**
     * 
     * @param page
     */
    public void setPage(PagingBean<OrderInfoDetail> page) {
        this.page = page;
    }
    /**
     * 
     * @return orderInfo
     */
    public OrderInfoDetail getOrderInfo() {
        return orderInfo;
    }
    /**
     * 
     * @param orderInfo
     */
    public void setOrderInfo(OrderInfoDetail orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PagingBean<BillItem> getItemPage() {
        return itemPage;
    }

    public void setItemPage(PagingBean<BillItem> itemPage) {
        this.itemPage = itemPage;
    }

    public BillItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(BillItem orderItem) {
        this.orderItem = orderItem;
    }


}
