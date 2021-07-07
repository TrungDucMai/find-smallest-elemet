package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        int N = input.nextInt();
        int Arr[]= new int[N];
        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Nhap gia tri phan tu cua mang");
            Arr[i]= input.nextInt();
        }
        System.out.printf("%-20s%s", "Cac phan tu trong mang : ", "");
        for (int j = 0; j < Arr.length; j++) {
            System.out.print(Arr[j] + "\t");
        }
        // TÌm giá trị nhỏ nhất
        int Min = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i]>Min){
                Min =Arr[i];
            }
        }
        System.out.println("Gia tri nho nhat la "+ Min);
    }

}
