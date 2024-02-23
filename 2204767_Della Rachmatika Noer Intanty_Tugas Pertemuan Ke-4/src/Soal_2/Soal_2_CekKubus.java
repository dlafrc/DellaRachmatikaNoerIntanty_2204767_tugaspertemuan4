/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Soal_2_CekKubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi 1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan panjang sisi 2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan panjang sisi 3: ");
        double sisi3 = input.nextDouble();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }

        input.close();
    }
}
