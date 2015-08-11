/*
*Project Name: common
* File Name: WMSReceiptResponseBean.java
* Class Name: WMSReceiptResponseBean
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
public class WMSReceiptResponseBean extends ResponseBaseBean{
	private static final long   serialVersionUID = 1L;
    private boolean             isSucceed;
    private String              responseMsg;
    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean isSucceed) {
        this.isSucceed = isSucceed;
    }

    public void setResponseMessage(String responseMsg) {
        this.responseMsg = responseMsg;
    }

}
