/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keobuabao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lengu
 */
public class KeoBuaBao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        String playOrNot;
        Random rd = new Random();

        //kéo = 0
        //búa = 1
        //bao = 2
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Nhấn (Y) để chơi");
            int kq = rd.nextInt(3);
            System.out.println("Nhấn bất kì phím để dừng");
            playOrNot = sc.nextLine().trim().toLowerCase();
            System.out.println("-----------------------------------------------");
            if (playOrNot.equals("y")) {
                System.out.println("Nhập lựa chọn của bạn");
                System.out.println("(1)Kéo");
                System.out.println("(2)Búa");
                System.out.println("(3)Bao");
                luaChon = Integer.parseInt(sc.nextLine());
                int tmp = luaChon - 1;
                System.out.println("-----------------------------------------------");

                if (tmp == kq) {
                    if (kq == 0) {
                        System.out.println("Bạn chọn: Kéo");
                        System.out.println("Máy chọn: Kéo");
                    } else if (kq == 1) {
                        System.out.println("Bạn chọn: Búa");
                        System.out.println("Máy chọn: Búa");
                    } else {
                        System.out.println("Bạn chọn: Bao");
                        System.out.println("Máy chọn: Bao");
                    }
                    System.out.println("Hòa");
                } else {
                    if (tmp == 0 && kq == 1) {
                        System.out.println("Bạn chọn: Kéo");
                        System.out.println("Máy chọn: Búa");
                        System.out.println("Thua");
                    } else if (tmp == 0 && kq == 2) {
                        System.out.println("Bạn chọn: Kéo");
                        System.out.println("Máy chọn: Bao");
                        System.out.println("Thắng");
                    } else if (tmp == 1 && kq == 0) {
                        System.out.println("Bạn chọn: Búa");
                        System.out.println("Máy chọn: Kéo");
                        System.out.println("Thắng");
                    } else if (tmp == 1 && kq == 2) {
                        System.out.println("Bạn chọn: Búa");
                        System.out.println("Máy chọn: Bao");
                        System.out.println("Thua");
                    } else if (tmp == 2 && kq == 0) {
                        System.out.println("Bạn chọn: Bao");
                        System.out.println("Máy chọn: Kéo");
                        System.out.println("Thua");
                    } else if (tmp == 2 && kq == 1) {
                        System.out.println("Bạn chọn: Bao");
                        System.out.println("Máy chọn: Búa");
                        System.out.println("Thắng");
                    }
                }
            }

        } while (playOrNot.equals("y"));
    }

}
