package facade.service.ordetailmodule.ordercontrol;


import facade.conroller.contract.OrderBasicVO;
import facade.conroller.contract.OrderControlInfoVO;
import facade.dao.OrderDetailResponseTO;
import facade.service.ordetailmodule.orderbasic.OrderDetailBasicView;

/**
 * Create by dgx 2022-09-29 20:06
 */
public class OrderControlTaxiView extends OrderControlView {




    @Override
    public OrderControlInfoVO generateOrderControlInfo(OrderDetailResponseTO orderDetailResponseTO) {
        return new OrderControlInfoVO();
    }
}
