package com.manchesterDigital;

public class OrderProcessor {

    private  OrderStatus orderStatus;

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void obtainCurrentOrderStatus() {
        if (orderStatus == OrderStatus.DISPATCHED) {
            System.out.println("You should receive your item soon ...");
        }else {
            System.out.println("We have no idea. However your order is at stage: " + orderStatus.toString());
        }

    }

    public void printOrderMessage() {

        System.out.println(orderStatus.getMessage());

    }

}
