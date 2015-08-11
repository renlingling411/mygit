/*
*Project Name: common
* File Name: ClearanceLogisticsRequsetBean.java
* Class Name: ClearanceLogisticsRequsetBean
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

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.PagingBean;
import com.yto.globalunion.waybill.BLCWayBill;

/**
 * Description:
 *
 * @author qianqianzhu
 *
 */
public class ClearanceLogisticsRequsetBean extends RequestBaseBean implements IMultiLanguageable{

    private static final long        serialVersionUID = 1L;
    private Long                     id;
    private String                   langCode;
    private CLRequestDetailBean      cLRequestDetailBean;
    private PagingBean<BLCWayBill>   page;
    
    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
        
    }        

    /** 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the cLRequestDetailBean
     */
    public CLRequestDetailBean getcLRequestDetailBean() {
        return cLRequestDetailBean;
    }

    /**
     * @param cLRequestDetailBean the cLRequestDetailBean to set
     */
    public void setcLRequestDetailBean(CLRequestDetailBean cLRequestDetailBean) {
        this.cLRequestDetailBean = cLRequestDetailBean;
    }

    /**
     * @return the page
     */
    public PagingBean<BLCWayBill> getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(PagingBean<BLCWayBill> page) {
        this.page = page;
    }

    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }
    
    
}
