/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1002;

import java.util.Scanner;

public class Projeto1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R;
        double A;
        double N;
        N = 3.14159;
        R = sc.nextDouble();
        A = N * R * R;
        System.out.printf("A=%.4f\n", A);
    }
}