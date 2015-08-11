/*
*Project Name: common
* File Name: PrintResponse.java
* Class Name: PrintResponse
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
package com.yto.globalunion.waybill.generalgunscanprint;

import java.io.Serializable;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.BillInfo;

/**
 * Description:
 *
 * @author dongdongliu
 *
 */
public class PrintResponse extends ResponseBaseBean implements Serializable {
    private static final long serialVersionUID = -2481151620895923418L;
    private BillInfo          billInfo;
    private String            msg;
    private boolean           isSuccess;

    public BillInfo getBillInfo() {
        return billInfo;
    }

    public void setBillInfo(BillInfo billInfo) {
        this.billInfo = billInfo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
}
