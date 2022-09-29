package facade.service.ordetailmodule.ordercontrol;

import facade.conroller.contract.OrderControlInfoVO;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 20:11
 */
public abstract class OrderControlView {

    abstract  OrderControlInfoVO generateOrderControlInfo(OrderDetailResponseTO orderDetailResponseTO);
}
