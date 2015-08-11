/*
*Project Name: common
* File Name: TradeOrderQueryRequestBean.java
* Class Name: TradeOrderQueryRequestBean
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

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.tmallOrder.entity.TradeOrder;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TradeOrderQueryRequestBean extends RequestBaseBean {
    private static final long      serialVersionUID = 1L;
    private PagingBean<TradeOrder> page;
    private TradeOrder             order;

    public PagingBean<TradeOrder> getPage() {
        return page;
    }

    public void setPage(PagingBean<TradeOrder> page) {
        this.page = page;
    }

    public TradeOrder getOrder() {
        return order;
    }

    public void setOrder(TradeOrder order) {
        this.order = order;
    }

}
