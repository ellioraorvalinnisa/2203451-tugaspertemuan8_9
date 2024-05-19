/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ellioraorvalinnisa_2203451.polymorphism;

/**
 *
 * @author Elliora Orva Linnisa
 */
public class Polymorphism {
    public static void main(String[] args) {
        Person person = new Person("Elliora Orva Linnisa", "Jl. Tanimulya Indah No.25", "081322663356", "ellrvlns@gmail.com");
        Student student = new Student("Hemanta Dianti", "Jl. Permata No.3", "08123344556", "hmtdnt@gmail.com", Student.JUNIOR);
        MyDate tanggalDipekerjakan = new MyDate(2020, 5, 1);
        Employee employee =new Employee("Salsa S", "Jl. Maribaya No.132", "081322435799", "salsa@gmail.com", "UPI Cabang", 
                2500000, tanggalDipekerjakan);
        Faculty faculty = new Faculty("Reni Marselawati", "Jl. Puri No.2", "082190885632", "renmar@gmail.com", "UPI Pusat", 
                6700000, tanggalDipekerjakan, "9-5", "Profesor");
        Staff staff = new Staff("Ikbal", "Jl. Sriwijaya No.12", "081722245665", "ball@gmail.com", "UPI Cabang", 1500000, 
                tanggalDipekerjakan, "Manajer");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
