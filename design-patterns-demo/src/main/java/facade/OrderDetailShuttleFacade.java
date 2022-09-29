package facade;

import facade.conroller.contract.OrderDetailResponse;
import facade.dao.OrderDetailResponseTO;

/**
 * Create by dgx 2022-09-29 19:36
 */
public class OrderDetailShuttleFacade implements OrderDetailFacade {

      /**
       *
       * @param orderDetailResponseTO  订单接口 或者数据库数据
       * @return view层数据
       */
      public  OrderDetailResponse  generateInterFace(OrderDetailResponseTO orderDetailResponseTO){
            return new OrderDetailResponse();
      }

}
