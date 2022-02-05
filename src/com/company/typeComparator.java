package com.company;

import java.util.Comparator;

class typeComparator implements Comparator<Users> {


    public int compare(Users t1, Users t2) {
        int returnValue = 0;
        if (t1.getType().getOrder() > t2.getType().getOrder()) {
            returnValue = 1;
        } else if (t1.getType().getOrder() < t2.getType().getOrder()) {
            returnValue = -1;
        }
        return returnValue;
    }


}


