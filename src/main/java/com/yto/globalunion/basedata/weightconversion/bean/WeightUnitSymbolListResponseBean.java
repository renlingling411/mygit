/*
*Project Name: common
* File Name: WeightUnitSymbolListResponseBean.java
* Class Name: WeightUnitSymbolListResponseBean
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

import java.util.List;
import com.yto.globalunion.common.bean.ResponseBaseBean;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class WeightUnitSymbolListResponseBean extends ResponseBaseBean{

    private static final long serialVersionUID = 1L;

    private List<String>  list;

    /**
     * @return the list
     */
    public List<String> getList() {
        return list;
    }
    /**
     * @param list the list to set
     */
    public void setList(List<String> list) {
        this.list = list;
    }

    
}
