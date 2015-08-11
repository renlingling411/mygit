/*
*Project Name: common
* File Name: ImportBLCWayBillBean.java
* Class Name: ImportBLCWayBillBean
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

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;
import com.yto.globalunion.common.entity.User;
import com.yto.globalunion.waybill.BLCWayBill;

/**
 * Description:
 *
 * @author qianqianzhu
 *
 */
public class ImportBLCWayBillRequestBean extends RequestBaseBean implements IMultiLanguageable{

    private static final long serialVersionUID = 1L;
    
    // 解析excel获得数据
    private List<BLCWayBill>    list;

    private String            langCode;

    private String[][]        excelData;

    private User              userParam;
    

    @Override
    public void setLangCode(String langCode) {
       this.langCode = langCode;
        
    }


    /**
     * @return the list
     */
    public List<BLCWayBill> getList() {
        return list;
    }


    /**
     * @param list the list to set
     */
    public void setList(List<BLCWayBill> list) {
        this.list = list;
    }


    /**
     * @return the excelData
     */
    public String[][] getExcelData() {
        return excelData;
    }


    /**
     * @param excelData the excelData to set
     */
    public void setExcelData(String[][] excelData) {
        this.excelData = excelData;
    }


    /**
     * @return the userParam
     */
    public User getUserParam() {
        return userParam;
    }


    /**
     * @param userParam the userParam to set
     */
    public void setUserParam(User userParam) {
        this.userParam = userParam;
    }


    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }
    

}
