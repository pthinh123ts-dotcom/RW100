package com.vti.frontend;

import com.vti.entity.ex5.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    ArrayList<Staff> staffList;
    staffList = new ArrayList<Staff>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\n--- HỆ THỐNG QUẢN LÝ CÁN BỘ ---");
        System.out.println("1) Thêm mới cán bộ");
        System.out.println("2) Tìm kiếm theo họ tên");
        System.out.println("3) Hiển thị thông tin danh sách cán bộ");
        System.out.println("4) Xóa cán bộ theo tên");
        System.out.println("5) Thoát khỏi chương trình");
        System.out.print("Mời bạn chọn chức năng (1-5): ");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                addStaff();
                break;
            case 2:
                findStaff();
                break;
            case 3:
                printListStaff();
                break;
            case 4:
                deleteByName();
                break;
            case 5:
                return;
            default:
                System.out.println("Vui lòng chon đúng lựa chọn trên menu");
                break;
        }
    }

}


}

