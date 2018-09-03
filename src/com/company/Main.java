package com.company;

import java.util.Scanner;

/**
 * Aplikasi kalkulator penghitung segiduabelas
 *
 * @Author bacharuddinadieb
 * @NIM 6706180113
 * @Version 1.0
 * @Since 2018-08-31
 */

public class Main {

    public static void main(String[] args) {

        double l, k; // l = Luas, k = Keliling
        double s = 4; // s = Sisi

        System.out.println("\nKalkulator Segiduabelas \n");

        Scanner InputUser = new Scanner(System.in); // Inisialisasi Scanner(input user)
        System.out.print("Masukkan Sisi dari segi Duabelas: ");
        s = InputUser.nextDouble(); // Memasukkan input user ke variable

        k = s * 12; //Rumus Keliling
        l = 3 * (s * s) / (2 - Math.sqrt(3)); //Rumus Luas

        System.out.println("\n\nSisi Segiduabelas: " + s);
        System.out.println("Keliling Segiduabelas: " + k);
        System.out.println("Luas Segiduabelas: " + l);
    }
}
