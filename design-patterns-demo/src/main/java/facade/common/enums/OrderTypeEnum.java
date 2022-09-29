package facade.common.enums;

/**
 * Create by dgx 2022-09-29 19:51
 */
public enum OrderTypeEnum {

    /**
     * 打车
     */
    TAXI(1),
    /**
     * 接送机
     */
    SHUTTLE(2),
    /**
     * 租车
     */
    RENT_CAR(3),
    /**
     * 包车
     */
    CHARTERED_CAR(4);
    int type;

    OrderTypeEnum(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }


    public static  OrderTypeEnum getOrderDetailFacadeTypeByOrderType(int orderType){
        for (OrderTypeEnum orderTypeEnum : OrderTypeEnum.values()) {

            if (orderTypeEnum.getType()==orderType){

             return orderTypeEnum;
            }
        }
        return  null;
    }
}
