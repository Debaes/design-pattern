package facade;

import facade.conroller.contract.*;
import facade.dao.OrderDetailResponseTO;
import facade.service.ordetailmodule.orderbasic.OrderDetailTaxiBasicView;
import facade.service.ordetailmodule.ordercontrol.OrderControlTaxiView;
import facade.service.ordetailmodule.ordermoney.OrderDetailTaixMoneyView;
import facade.service.ordetailmodule.ordertravel.OrderTravelTaxiView;

/**
 * Create by dgx 2022-09-29 19:36
 */
public class OrderDetailRentCarFacade implements OrderDetailFacade {

      /**
       *
       * @param orderDetailResponseTO  订单接口 或者数据库数据
       * @return view层数据
       */
      public  OrderDetailResponse  generateInterFace(OrderDetailResponseTO orderDetailResponseTO){

            OrderBasicVO orderBasicVO = new OrderDetailTaxiBasicView().generateOrderBasic(orderDetailResponseTO);
            OrderMoneyVO orderMoneyVO = new OrderDetailTaixMoneyView().generateOrderMoneyVO(orderDetailResponseTO);
            OrderTravelInfoVO orderTravelInfoVO = new OrderTravelTaxiView().generateOrderTravelInfoVO(orderDetailResponseTO);
            OrderControlInfoVO orderControlInfoVO = new OrderControlTaxiView().generateOrderControlInfo(orderDetailResponseTO);
            return OrderDetailFacade.getOrderDetailResponse(orderBasicVO, orderMoneyVO, orderTravelInfoVO, orderControlInfoVO);
      }


}
