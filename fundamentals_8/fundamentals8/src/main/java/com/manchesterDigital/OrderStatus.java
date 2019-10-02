package com.manchesterDigital;

public enum OrderStatus {

    PENDING("Order is pending"),
    DISPATCHED("Order has been dispatched"),
    DECLINED("haha loser"),
    AWAITING_PAYMENT("You've got no money!!!"),
    PROCESSED("Done");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
