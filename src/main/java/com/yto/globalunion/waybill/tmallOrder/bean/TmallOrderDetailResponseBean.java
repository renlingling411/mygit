/*
*Project Name: common
* File Name: TmallOrderDetailResponseBean.java
* Class Name: TmallOrderDetailResponseBean
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

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBean;
import com.yto.globalunion.waybill.tmallOrder.entity.TmallOrderDetail;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallOrderDetailResponseBean extends ResponseBean {

    private static final long serialVersionUID = 1L;
    private TmallOrderDetail  order;

    public TmallOrderDetail getOrder() {
        return order;
    }

    public void setOrder(TmallOrderDetail order) {
        this.order = order;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
