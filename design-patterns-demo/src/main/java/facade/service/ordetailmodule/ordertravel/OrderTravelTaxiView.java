package facade.service.ordetailmodule.ordertravel;


import facade.conroller.contract.OrderControlInfoVO;
import facade.conroller.contract.OrderTravelInfoVO;
import facade.dao.OrderDetailResponseTO;
import facade.service.ordetailmodule.ordercontrol.OrderControlView;

/**
 * Create by dgx 2022-09-29 20:06
 */
public class OrderTravelTaxiView extends OrderTravelView {


    @Override
  public   OrderTravelInfoVO generateOrderTravelInfoVO(OrderDetailResponseTO orderDetailResponseTO) {
        return new OrderTravelInfoVO();
    }
}
