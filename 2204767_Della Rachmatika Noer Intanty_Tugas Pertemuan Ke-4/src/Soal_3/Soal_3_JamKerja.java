/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_3;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Soal_3_JamKerja {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam masuk (1-12): ");
        int jamMasuk = input.nextInt();

        System.out.print("Masukkan jam keluar (1-12): ");
        int jamKeluar = input.nextInt();

        // Menghitung lama bekerja
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            // Jika jam keluar melewati tengah malam
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }

        System.out.println("Lama Bekerja: " + lamaBekerja + " Jam");

        input.close();
    }
}
