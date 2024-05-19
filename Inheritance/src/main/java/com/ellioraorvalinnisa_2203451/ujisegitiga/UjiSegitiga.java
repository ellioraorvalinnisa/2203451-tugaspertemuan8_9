/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.ujisegitiga;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class UjiSegitiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi kedua: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi ketiga: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan color: ");
        String color = input.next();

        System.out.print("Apakah segitiga filled? (true/false): ");
        boolean filled = input.nextBoolean();

        SegitigayangmemanjangObjekGeometris segitiga = new SegitigayangmemanjangObjekGeometris(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("\nLuas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("True/False, apakah segitiga terisi?" + " : " + segitiga.isFilled());
    } 
}
