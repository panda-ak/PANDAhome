package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(nameOfGun(16,35));
        System.out.println(nameOfGun(65,-10));
        System.out.println(nameOfGun(33,16));
        System.out.println(nameOfGun(25,2));
        System.out.println(nameOfGun(20,-3));
    }

    public static String nameOfGun(int AGE, int temperature) {
        if (AGE > 20 && AGE < 48 && temperature > -20 && temperature < 35) {
            return "можно гулять";
        } else if (AGE < 20 && temperature > 0 && temperature < 28) {
            return "гулять можно";
        } else if (AGE > 45 && temperature > 0 && temperature < 25) {
            return "можно гулять";
        } else {
            return "останься дома";


        }
    }
}