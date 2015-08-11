/*
*Project Name: common
* File Name: WeightUnitSymbolListRequest.java
* Class Name: WeightUnitSymbolListRequest
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
package com.yto.globalunion.basedata.weightconversion.bean;

import com.yto.globalunion.common.bean.IMultiLanguageable;
import com.yto.globalunion.common.bean.RequestBaseBean;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class WeightUnitSymbolListRequestBean extends RequestBaseBean implements IMultiLanguageable{
   
    private static final long serialVersionUID = 1L;
    private String            langCode;
    private Long              userId;
    private String            weightUnitSymbol;
    
    /**
     * @return the langCode
     */
    public String getLangCode() {
        return langCode;
    }
    /**
     * @param langCode the langCode to set
     */
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getWeightUnitSymbol() {
        return weightUnitSymbol;
    }
    
    public void setWeightUnitSymbol(String weightUnitSymbol) {
        this.weightUnitSymbol = weightUnitSymbol;
    }
    

}
