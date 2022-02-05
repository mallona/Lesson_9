package com.company;

import java.util.Comparator;

public class loginComparator implements Comparator<Users> {

    public int compare(Users u1, Users u2) {
        return u1.getLogin().compareTo(u2.getLogin());
    }
}
