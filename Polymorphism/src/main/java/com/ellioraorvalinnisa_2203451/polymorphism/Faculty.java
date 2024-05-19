/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ellioraorvalinnisa_2203451.polymorphism;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String telepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, telepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jam Kerja: " + jamKerja + ", Pangkat: " + pangkat;
    }
}