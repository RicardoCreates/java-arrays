package de.ricardo;

public class Main {
    public static void main(String[] args) {

        int[] coinbox = {1, 20, 5, 10, 20};
        int[] coinbox2 = new int[5];

        for (int i = 0; i < coinbox.length; i++) {
            System.out.println(coinbox[i]);
        }

        for (int coin : coinbox) {
            System.out.println(coin);
        }

    }
}