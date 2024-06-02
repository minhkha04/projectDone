/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.Scanner;

import data.*;
import java.lang.reflect.Array;

public class StudentManager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        int choice;
        do {
            se.printMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = se.checkInputInt();
            switch (choice) {
                case 1:
                    System.out.println("----------------------------------------------------");
                    se.addAStudent();
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    se.printfListProfile();
                    System.out.println("----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    Student tmp = se.findAStudentById();
                    if (tmp == null) {
                        System.out.println("Không tìm thấy");
                    } else {
                        System.out.println("Sinh viên cần tìm");
                        tmp.showProfile();
                    }
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("----------------------------------------------------");
                    se.changeInformation();
                    System.out.println("----------------------------------------------------");
                    break;
                case 5:
                    System.out.println("----------------------------------------------------");
                    se.remove();
                    System.out.println("----------------------------------------------------");
                    break;
                case 6:
                    System.out.println("----------------------------------------------------");
                    se.xapXepDanhSachTheoGPATangDan();
                    se.printfListProfile();
                    System.out.println("----------------------------------------------------");
                    break;
                case 7:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Nhập lựa chọn từ 1 đến 7:");
            }
        } while (choice != 7);
    }

}
