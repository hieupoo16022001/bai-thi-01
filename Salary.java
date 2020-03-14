/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithi01;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeFullTime e1 = new EmployeeFullTime();
        EmployeePartime e2 = new EmployeePartime();
        System.out.println("Input baseSalary Fulltime : ");
        e1.setSalary(in.nextFloat());
        System.out.println("Input baseSalary Parttime : ");
        e2.setSalary(in.nextFloat());
        System.out.println("Full time : " + e1.getSalary());
        System.out.println("part time : " + e2.getSalary());
    }
    
}
