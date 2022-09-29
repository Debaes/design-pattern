package facade.service.ordetailmodule.ordermoney;


import facade.conroller.contract.OrderControlInfoVO;
import facade.conroller.contract.OrderMoneyVO;
import facade.dao.OrderDetailResponseTO;
import facade.service.ordetailmodule.ordercontrol.OrderControlView;

/**
 * Create by dgx 2022-09-29 20:06
 */
public class OrderDetailTaixMoneyView extends OrderDetailMoneyView {


    @Override
    public OrderMoneyVO generateOrderMoneyVO(OrderDetailResponseTO orderDetailResponseTO) {
        return new OrderMoneyVO();
    }
}
