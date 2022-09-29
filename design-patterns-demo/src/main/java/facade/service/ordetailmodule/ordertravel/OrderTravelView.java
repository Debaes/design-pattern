package facade.service.ordetailmodule.ordertravel;

import facade.conroller.contract.OrderMoneyVO;
import facade.conroller.contract.OrderTravelInfoVO;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 20:11
 */
public abstract class OrderTravelView {

  abstract OrderTravelInfoVO generateOrderTravelInfoVO(OrderDetailResponseTO orderDetailResponseTO);
}
