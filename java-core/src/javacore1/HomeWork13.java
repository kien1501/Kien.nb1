package javacore1;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n= sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
