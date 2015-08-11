
package com.yto.globalunion.waybill.orderimport.bean;

import java.util.List;

import com.yto.globalunion.common.bean.ResponseBaseBean;
import com.yto.globalunion.waybill.BillItem;
import com.yto.globalunion.waybill.orderimport.entity.OrderInfoDetail;

/**
 * Description:
 *
 * @author zhongyidong
 *
 */
public class OrderInfoImportUpdateResponseBean extends ResponseBaseBean {

    private static final long serialVersionUID = 1L;
    
    private OrderInfoDetail orderInfo;
    private List<BillItem>  orderItem;

    /**
     * 
     * @return orderInfo
     */
    public OrderInfoDetail getOrderInfo() {
        return orderInfo;
    }
    /**
     * @param orderInfo
     */
    public void setOrderInfo(OrderInfoDetail orderInfo) {
        this.orderInfo = orderInfo;
    }
    public List<BillItem> getOrderItem() {
        return orderItem;
    }
    public void setOrderItem(List<BillItem> orderItem) {
        this.orderItem = orderItem;
    }
   
}
