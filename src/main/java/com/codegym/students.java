package com.codegym;

import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        String[] students = {"Nam", "Chinh", "Anh", "Hai", "Chung", "Dung", "Duy", "Tien"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten hoc sinh: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (input_name.equals(students[i])) {
                System.out.println("vi tri cua " + input_name + " trong danh sach la " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("khong tim thay " + input_name + " trong danh sach");
    }
}
