/*
*Project Name: common
* File Name: WMSReceiptRequestBean.java
* Class Name: WMSReceiptRequestBean
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
package com.yto.globalunion.common.bean;

/**
 * Description:
 *
 * @author xiaoxiazhang1
 *
 */
public class WMSReceiptRequestBean extends RequestBaseBean{
	private static final long serialVersionUID = 1L;
    private String            xmlData;
    private Long id;

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
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
    

    
    

}
