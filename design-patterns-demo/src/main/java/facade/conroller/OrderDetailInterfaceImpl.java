package facade.conroller;

import facade.*;
import facade.conroller.contract.OrderDetailRequest;
import facade.conroller.contract.OrderDetailResponse;
import facade.common.enums.OrderTypeEnum;
import facade.dao.OrderDetailDao;
import facade.dao.OrderDetailResponseTO;


/**
 * Create by dgx 2022-09-29 19:35
 */
public class OrderDetailInterfaceImpl implements  OrderDetailInterface {


    public OrderDetailResponse getOrderDetail(OrderDetailRequest request) {
        Long orderId = request.getOrderId();


        OrderDetailDao orderDetailDao =new OrderDetailDao();
        OrderDetailResponseTO orderData = orderDetailDao.getOrderData(orderId);

        OrderDetailFacade instance = getInstance(orderData.getType());
        if (instance==null){
            throw   new RuntimeException("不存在该订单类型");
        }

        return    instance.generateInterFace(orderData);
    }


    /**
     *
     * @param type  订单类型 1 打车 2 接送机 3 租车 4 包车
     * @return
     */
    OrderDetailFacade  getInstance(int type){

        OrderTypeEnum orderDetailFacadeTypeByOrderType = OrderTypeEnum.getOrderDetailFacadeTypeByOrderType(type);
        if (orderDetailFacadeTypeByOrderType==null){
            return null;
        }
        switch (orderDetailFacadeTypeByOrderType){
            case TAXI:
                return new OrderDetailTaxiFacade();
            case SHUTTLE:
                return new OrderDetailShuttleFacade();
            case RENT_CAR:
                return new OrderDetailRentCarFacade();
            case CHARTERED_CAR:
                return new OrderDetailCharteredFacade();
            default:
                return null;
        }

    }

}
