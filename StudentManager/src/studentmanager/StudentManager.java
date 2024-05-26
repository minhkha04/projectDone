/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanager;

import java.util.Scanner;

import data.*;

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
                    se.addAStudent();
                    break;
                case 2:
                    se.printfListProfile();
                    break;
                case 3:
                    Student tmp = se.findAStudentById();
                    if (tmp == null) {
                        System.out.println("Không tìm thấy");
                    } else {
                        System.out.println("Sinh viên cần tìm");
                        tmp.showProfile();
                    }
                    break;
                case 4:
                    se.changeInformation();
                    break;
                case 5:
                    se.remove();
                    break;
                case 6:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Nhập lựa chọn từ 1 đến 6:");
            }
        } while (choice != 6);
    }

}
