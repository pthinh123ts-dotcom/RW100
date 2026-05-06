package com.vti.backend;

import com.vti.Enum.Gender;
import com.vti.entity.ex5.Engineer;
import com.vti.entity.ex5.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner;
        ArrayList<Staff> staffArrayList;


            scanner = new Scanner(System.in);
            staffArrayList = new ArrayList<Staff>();


        public void addNewStaff() {
            System.out.println("Thêm mới cán bộ");
            System.out.println("1. Thêm Engineer");
            System.out.println("2. Thêm Worker");
            System.out.println("3. Thêm Employee");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:

                    System.out.println("Thêm mới Engineer");
                    System.out.println("Nhập vào tên:");
                    String nameEngineer = scanner.next();

                    System.out.println("Nhập vào tuổi Engineer: ");
                    int ageEngineer = scanner.nextInt();

                    System.out.println("Lựa chọn giới tính: 1.MALE, 2.FEMALE, 3.UNKNOWN");
                    int genderchoose = scanner.nextInt();
                    genderchoose genderEngineer = null;

                    switch (genderchoose) {
                        case 1:
                            genderEngineer = Gender.MALE;
                            break;
                        case 2:
                            genderEngineer = Gender.FEMALE;
                            break;
                        case 3:
                            genderEngineer = Gender.UNKNOW;
                            break;
                    }

                    System.out.println("Nhập vào địa chỉ Engineer: ");
                    String addressEngineer = scanner.next();

                    System.out.println("Nhập vào chuyên ngành Engineer: ");
                    String specializedEngineer = scanner.next();


                    Engineer engineer = new Engineer(nameEngineer, ageEngineer, genderEngineer, addressEngineer,
                            specializedEngineer);


                    staffArrayList.add(engineer);
                    break;
                case 2:
                    System.out.println("Thêm mới Worker");
                    System.out.println("Nhập vào tên:");
                    String nameWorker = scanner.next();

                    System.out.println("Nhập vào tuổi Engineer: ");
                    int ageWorker = scanner.nextInt();

                    System.out.println("Lựa chọn giới tính: 1.MALE, 2.FEMALE, 3.UNKNOWN");
                    int genderchoose1 = scanner.nextInt();
                    genderchoose1 genderWorker = null;

                    switch (genderchoose1) {
                        case 1:
                            genderWorker = Gender.MALE;
                            break;
                        case 2:
                            genderWorker = Gender.FEMALE;
                            break;
                        case 3:
                            genderWorker = Gender.UNKNOW;
                            break;
                    }
                    System.out.println("Nhập vào địa chỉ Worker: ");
                    String addressWorker = scanner.next();

                    System.out.println("Nhập vào chuyên ngành Worker: ");
                    String specializedWorker = scanner.next();


                    break;
                case 3:
                    System.out.println("Thêm mới Employee");
                    System.out.println("Nhập vào tên:");
                    String nameEmployee = scanner.next();

                    System.out.println("Nhập vào tuổi Engineer: ");
                    int ageEmployee = scanner.nextInt();

                    System.out.println("Lựa chọn giới tính: 1.MALE, 2.FEMALE, 3.UNKNOWN");
                    int genderchoose2 = scanner.nextInt();
                    genderchoose2 genderEmployee = null;

                    switch (genderchoose2) {
                        case 1:
                            genderWorker = Gender.MALE;
                            break;
                        case 2:
                            genderWorker = Gender.FEMALE;
                            break;
                        case 3:
                            genderWorker = Gender.UNKNOW;
                            break;
                    }
                    System.out.println("Nhập vào địa chỉ Worker: ");
                    String addressEmployee = scanner.next();

                    System.out.println("Nhập vào chuyên ngành Worker: ");
                    String specializedEmployee = scanner.next();

                    break;

            }
        }


        public void findName() {
            System.out.println("Tìm kiếm theo họ tên");
        }

        public void showListStaff() {
            System.out.println("Hiển thị thông tin danh sách cán bộ đang có trên hệ thống");
            for (Staff staff : staffArrayList) {
                System.out.println(staff.toString());
            }
        }


        public void deleteStaffByName() {
            System.out.println("Nhập vào tên của cán bộ cần xóa");
            String deleteName = scanner.next();

            Iterator<Staff> iterator = staffArrayList.iterator();
            while (iterator.hasnext()) {
                Staff staff = iterator.next();

                if (staff.getName().equals(deleteName)) {
                    iterator.remove();
                    System.out.println("Đã xóa thành công!!");
                    System.out.println("Danh sách Cán bộ sau khi xóa: ");
                    showListStaff();
                }
            }
        }

        private void printListStaff() {
            for (Staff staff : staffArrayList) {
                System.out.println(staff);
            }
        }


        private void deleteByName() {
            System.out.println("Nhập tên cần xóa thông tin: ");
            String deleteName = scanner.next();
            Iterator<Staff> iterator = staffArrayList.iterator();
            while (iterator.hasNext()) {
                Staff staff = iterator.next();
                if (staff.getName().equals(deleteName)) {
                    iterator.remove();
                }
            }

        }
    }
    }
}