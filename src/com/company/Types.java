package com.company;


public enum Types {
    ADMIN(1),
    PREMIUM(2),
    AUTHORIZED(3),
    GUEST(4);

    private int order;

    private Types(int order) {

        this.order = order;
    }

    public int getOrder() {

        return order;
    }

}

