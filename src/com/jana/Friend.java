package com.jana;

public class Friend {
    String name;
    static int numberofFriends;
    Friend(String name) {
        this.name = name;
        numberofFriends++;
    }

    static class friend{
        int x= 10;
        void msg(){
            System.out.println("executed");
        }
    }

    static {
        System.out.println("block");
    }

    static int sum(){
//        System.out.println("hello");
        return 2;
    }
}
