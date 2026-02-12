/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tekprog;

/**
 *
 * @author Ziddan
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextInt()) {
                int t = sc.nextInt(); 
                
                for (int i = 0; i < t; i++) {
                    // Gunakan sc.next() untuk membaca sebagai String
                    // agar angka raksasa tidak menyebabkan error saat dibaca
                    String input = sc.next();
                    
                    try {
                        long n = Long.parseLong(input);
                        System.out.println(n + " can be fitted in:");
                        
                        if (n >= -128 && n <= 127) System.out.println("* byte");
                        if (n >= -32768 && n <= 32767) System.out.println("* short");
                        if (n >= -2147483648L && n <= 2147483647L) System.out.println("* int");
                        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) System.out.println("* long");
                        
                    } catch (NumberFormatException e) {
                        // Jika Long.parseLong gagal, berarti angkanya terlalu besar
                        System.out.println(input + " can't be fitted anywhere.");
                    }
                }
            }
        }
    }
}