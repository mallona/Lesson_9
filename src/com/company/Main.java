package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {


        ArrayList<Users> users = new ArrayList<>();
        users.add(new Users("Masha", "3", Types.ADMIN));
        users.add(new Users("Valera", "5", Types.PREMIUM));
        users.add(new Users("Nana", "4", Types.AUTHORIZED));
        users.add(new Users("Alla", "4", Types.ADMIN));
        users.add(new Users("Egor", "7", Types.GUEST));
        users.add(new Users("Alona", "3", Types.ADMIN));
        users.add(new Users("Zhenia", "7", Types.GUEST));
        users.add(new Users("Yulia", "8", Types.PREMIUM));
        users.add(new Users("Fedia", "2", Types.AUTHORIZED));
        users.add(new Users("Oleg", "10", Types.GUEST));
        System.out.print("Users hashcodes: ");
        for (Users i : users) {
            System.out.print(" " + i.hashCode());
        }
        System.out.println("\nUSERS NOT SORTED :" + users);

        Comparator<Users> comp = new typeComparator().thenComparing(new loginComparator());

        TreeSet<Users> treeFromUsers = new TreeSet<>(comp);
        treeFromUsers.addAll(users);

        System.out.println("USERS SORTED :" + treeFromUsers);

    }

}
