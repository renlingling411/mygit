/*
*Project Name: common
* File Name: TradeOrderQueryResponseBean.java
* Class Name: TradeOrderQueryResponseBean
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

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.tmallOrder.entity.TradeOrder;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TradeOrderQueryResponseBean extends ResponseBaseBean {
    private static final long     serialVersionUID = 1L;
    public PagingBean<TradeOrder> page;
   
    public PagingBean<TradeOrder> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<TradeOrder> page) {
        this.page = page;
    }
}
