/*
*Project Name: common
* File Name: TransportInfoResponseBean.java
* Class Name: TransportInfoResponseBean
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
package com.yto.globalunion.waybill.emsTransportInfo.bean;

import java.util.Map;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.emsTransportInfo.entity.TransportInfo;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TransportInfoResponseBean extends ResponseBaseBean {

    private static final long         serialVersionUID = 1L;
    private PagingBean<TransportInfo> page;
    private TransportInfo             info;
    private Map<String, Object>       map;

    public PagingBean<TransportInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<TransportInfo> page) {
        this.page = page;
    }

    public TransportInfo getInfo() {
        return info;
    }

    public void setInfo(TransportInfo info) {
        this.info = info;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

}
