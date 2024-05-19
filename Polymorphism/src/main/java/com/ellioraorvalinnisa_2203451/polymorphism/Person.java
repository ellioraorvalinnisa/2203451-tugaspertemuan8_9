/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.polymorphism;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Person {
    private String nama;
    private String alamat;
    private String telepon;
    private String email;

    public Person(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kelas: " + getClass().getName() + ", Nama: " + nama;
        //return "Kelas: " + getClass().getSimpleName() + ", Nama: " + nama;
    }
}
