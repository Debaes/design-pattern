package facade.service.ordetailmodule.ordermoney;

import facade.conroller.contract.OrderMoneyVO;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 20:11
 */
public abstract  class  OrderDetailMoneyView {

   abstract OrderMoneyVO generateOrderMoneyVO(OrderDetailResponseTO orderDetailResponseTO);
}
