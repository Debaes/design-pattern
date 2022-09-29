package facade.conroller.contract;

import lombok.Data;

/**
 * Create by dgx 2022-09-29 19:32
 */
@Data
public class OrderDetailResponse {

    /**
     * 基础信息
     */
    OrderBasicVO orderBasicVO;
    /**
     * 金额信息
     */
    OrderMoneyVO orderMoneyVO;
    /**
     * 行程信息
     */
    OrderTravelInfoVO orderTravelInfoVO;

    /**
     * 管控信息
     */
    OrderControlInfoVO orderControllInfoVO;
}
