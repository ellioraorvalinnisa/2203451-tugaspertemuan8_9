/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.polymorphism;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String telepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gelar: " + gelar;
    }
}