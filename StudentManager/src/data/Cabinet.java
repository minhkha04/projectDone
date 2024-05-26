package data;

import java.util.*;

public class Cabinet {

    List<Student> arr = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public void printMenu() {
        System.out.println("--------------------------------------");
        System.out.println("-----------Bảng lựa chọn--------------");
        System.out.println("---1. Thêm sinh viên------------------");
        System.out.println("---2. In ra danh sách sinh viên-------");
        System.out.println("---3. Tìm kiếm học sinh theo ID-------");
        System.out.println("---4. Thay đổi thông tin sinh viên----");
        System.out.println("---5. Xóa sinh viên khỏi danh sách----");
        System.out.println("---6. Thoát---------------------------");
        System.out.println("--------------------------------------");

    }

    public int checkInputInt() {
        int n = 0;
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số nguyên");
        }
        return n;
    }

    //1 thêm sinh viên mới
    public void addAStudent() {

        System.out.println("Mời nhập thông tin cho sinh viên #" + (arr.size() + 1));

        System.out.print("Nhập tên cho sinh viên: ");
        String name = sc.nextLine().trim().toUpperCase();

        System.out.print("Nhập ID cho sinh viên: ");
        String id = sc.nextLine().trim().toUpperCase();

        int yob = 0;
        while (true) {

            try {
                System.out.print("Nhập năm sinh cho sinh viên: ");
                yob = Integer.parseInt(sc.nextLine());
                if (checkPositiveInteger(yob)) {
                    break;
                } else {
                    System.out.println("Năm sinh phải lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập đúng định dạng năm sinh");
            }
        }

        double gpa = 0;
        while (true) {
            try {
                System.out.print("Nhập GPA cho sinh viên: ");
                gpa = Double.parseDouble(sc.nextLine());
                if (checkPostiveDouble(gpa) && gpa <= 10) {
                    break;
                } else {
                    System.out.println("GPA phải lớn hơn 0 và nhỏ hơn 10");
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập đúng dịnh dạng");
            }
        }

        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Nhập thông tin thành công");
    }
    public boolean checkPositiveInteger(int n) {
        return n > 0;
    }
    public boolean checkPostiveDouble(double n) {
        return n > 0;
    }

    //2 in ra danh sách sinh viên
    public void printfListProfile() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            System.out.println("Danh sách sinh viên");
            for (Student x : arr) {
                x.showProfile();
            }
        }
    }

    //3 tìm sinh viên
    public Student findAStudentById() {
        if (arr.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            System.out.print("Nhập ID sinh viên: ");
            String tmp = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId().equalsIgnoreCase(tmp)) {
                    return arr.get(i);
                }
            }
        }
        return null;
    }

    //4 thay đổi thông tin sinh viên
    public void changeInformation() {
        int choice;
        Student tmp = findAStudentById();
        do {
            if (tmp == null) {
                System.out.println("Không tìm thấy sinh viên");
                break;
            }
            printMenuChangeInformation();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = checkInputInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên mới cho sinh viên: ");
                    tmp.setName(sc.nextLine().trim());
                    System.out.println("Thay đổi tên thành công");
                    break;
                case 2:
                    int yob = 0;
                    while (true) {
                        try {
                            System.out.print("Nhập năm sinh mới cho sinh viên: ");
                            yob = Integer.parseInt(sc.nextLine());
                            if (checkPositiveInteger(yob)) {
                                tmp.setYob(yob);
                                break;
                            } else {
                                System.out.println("Năm sinh phải lớn hơn 0");
                            }
                        } catch (Exception e) {
                            System.out.println("Vui lòng nhập đúng định dạng năm sinh");
                        }
                    }
                    System.out.println("Thay đổi năm sinh thành công");
                    break;
                case 3:
                    double gpa = 0;
                    while (true) {
                        try {
                            System.out.print("Nhập GPA mới cho sinh viên: ");
                            gpa = Double.parseDouble(sc.nextLine());
                            if (checkPostiveDouble(gpa)  && gpa <= 10) {
                                tmp.setGpa(gpa);
                                break;
                            } else {
                                System.out.println("GPA phải lớn hơn 0 và nhỏ hơn 10");
                            }
                        } catch (Exception e) {
                            System.out.println("Vui lòng nhập đúng dịnh dạng");
                        }
                    }
                    System.out.println("Thay đổi GPA thành công");
                    break;
                case 4:
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.println("Nhập lựa chọn từ 1 đến 4:");
            }
        } while (choice != 4);
    }
    public void printMenuChangeInformation() {
        System.out.println("--------------------------------------");
        System.out.println("------------Bảng lựa chọn-------------");
        System.out.println("---1. Thay đổi tên--------------------");
        System.out.println("---2. Thay đổi năm sinh---------------");
        System.out.println("---3. Thay đổi GPA--------------------");
        System.out.println("---4. Thoát---------------------------");
        System.out.println("--------------------------------------");

    }

    //5 xóa sinh viên ra khỏi danh sách
    public void remove() {
        Student tmp = findAStudentById();
        if (tmp == null) {
            System.out.println("Không tìm thấy");
        } else {
            arr.remove(tmp);
        }
        System.out.println("Xóa thành công");

    }
}
