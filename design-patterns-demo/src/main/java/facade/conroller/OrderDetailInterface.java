package facade.conroller;

import facade.conroller.contract.OrderDetailRequest;
import facade.conroller.contract.OrderDetailResponse;


/**
 * Create by dgx 2022-09-29 19:31
 */
public interface OrderDetailInterface {


    OrderDetailResponse getOrderDetail(OrderDetailRequest request);
}
