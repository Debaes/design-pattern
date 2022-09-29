package facade.service.ordetailmodule.orderbasic;


import facade.conroller.contract.OrderBasicVO;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 20:06
 */
public abstract class OrderDetailBasicView {


   abstract   OrderBasicVO generateOrderBasic(OrderDetailResponseTO orderDetailResponseTO);

}
