/*
*Project Name: common
* File Name: TransportInfoRequestBean.java
* Class Name: TransportInfoRequestBean
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

import java.util.List;

import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.emsTransportInfo.entity.TransportInfo;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TransportInfoRequestBean extends RequestBaseBean {

    private static final long         serialVersionUID = 1L;
    private PagingBean<TransportInfo> page;
    private TransportInfo             transportInfo;
    private List<String>              ids;
    private String                    flightCountry;
    private String                    flightDate;

    public TransportInfo getTransportInfo() {
        return transportInfo;
    }

    public void setTransportInfo(TransportInfo transportInfo) {
        this.transportInfo = transportInfo;
    }

    public PagingBean<TransportInfo> getPage() {
        return page;
    }

    public void setPage(PagingBean<TransportInfo> page) {
        this.page = page;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getFlightCountry() {
        return flightCountry;
    }

    public void setFlightCountry(String flightCountry) {
        this.flightCountry = flightCountry;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

}
