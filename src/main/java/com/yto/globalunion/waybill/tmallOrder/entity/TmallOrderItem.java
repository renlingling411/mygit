/*
*Project Name: common
* File Name: TmallOrderItem.java
* Class Name: TmallOrderItem
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
package com.yto.globalunion.waybill.tmallOrder.entity;

import java.io.Serializable;

/**
 * Description:
 *
 * @author bx
 *
 */
public class TmallOrderItem implements Serializable{
    private static final long serialVersionUID = 1L;
    private String itemName;
    private String itemUnitPrice;
    private int itemQuantity;
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemUnitPrice() {
        return itemUnitPrice;
    }
    public void setItemUnitPrice(String itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }
    public int getItemQuantity() {
        return itemQuantity;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    
}
