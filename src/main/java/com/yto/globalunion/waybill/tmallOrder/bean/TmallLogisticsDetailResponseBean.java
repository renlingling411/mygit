/*
*Project Name: common
* File Name: TmallLogisticsDetailResponseBean.java
* Class Name: TmallLogisticsDetailResponseBean
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

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.tmallOrder.entity.TmallLogisticsDetail;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallLogisticsDetailResponseBean extends ResponseBaseBean {
    private static final long serialVersionUID = 1L;
    private List<TmallLogisticsDetail> list;

    public List<TmallLogisticsDetail> getList() {
        return list;
    }

    public void setList(List<TmallLogisticsDetail> list) {
        this.list = list;
    }
    
}
