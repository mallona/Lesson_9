package com.company;


public enum Types {
    ADMIN(4),
    PREMIUM(3),
    AUTHORIZED(2),
    GUEST(1);

    private int order;

    private Types(int order) {

        this.order = order;
    }

    public int getOrder() {

        return order;
    }

}

