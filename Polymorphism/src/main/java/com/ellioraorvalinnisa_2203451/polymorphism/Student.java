/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.polymorphism;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Student extends Person {
    public static final String MAHASISWA_BARU = "Mahasiswa Baru";
    public static final String MAHASISWA_TAHUN_KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + ", Status: " + status;
    }
}