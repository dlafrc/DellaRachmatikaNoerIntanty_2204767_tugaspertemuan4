/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_1;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */


public class Soal_1_UrutanKonsonanVokalKonsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga karakter (huruf kecil): ");
        String userInput = input.nextLine();

        if (userInput.length() == 3) {
            char char1 = userInput.charAt(0);
            char char2 = userInput.charAt(1);
            char char3 = userInput.charAt(2);

            if (isLowerCaseLetter(char1) && isLowerCaseLetter(char2) && isLowerCaseLetter(char3)) {
                if (isConsonant(char1) && char2 == 'a' && isConsonant(char3)) {
                    System.out.println("Urutan Konsonan-Vokal-Konsonan");
                } else {
                    System.out.println("Bukan Urutan Konsonan-Vokal-Konsonan");
                }
            } else {
                System.out.println("Masukan tidak valid, harap masukkan huruf kecil.");
            }
        } else {
            System.out.println("Masukan tidak valid, harap masukkan tiga karakter.");
        }

        input.close();
    }

    private static boolean isLowerCaseLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
}
