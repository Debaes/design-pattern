package facade;

import facade.conroller.contract.*;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 19:36
 */
public interface OrderDetailFacade {

      /**
       *
       * @param orderDetailResponseTO  订单接口 或者数据库数据
       * @return view层数据
       */
      OrderDetailResponse  generateInterFace(OrderDetailResponseTO orderDetailResponseTO);

      public static OrderDetailResponse getOrderDetailResponse(OrderBasicVO orderBasicVO, OrderMoneyVO orderMoneyVO, OrderTravelInfoVO orderTravelInfoVO, OrderControlInfoVO orderControlInfoVO) {
            OrderDetailResponse orderDetailResponse = new OrderDetailResponse();
            orderDetailResponse.setOrderBasicVO(orderBasicVO);
            orderDetailResponse.setOrderControllInfoVO(orderControlInfoVO);
            orderDetailResponse.setOrderMoneyVO(orderMoneyVO);
            orderDetailResponse.setOrderTravelInfoVO(orderTravelInfoVO);
            return orderDetailResponse;
      }
}
