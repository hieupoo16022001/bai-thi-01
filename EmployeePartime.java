/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithi01;

/**
 *
 * @author DELL
 */
public class EmployeePartime extends SalaryPolicy{
   private float rate;
   public EmployeePartime(){
       this.rate = 2.5f;
   }
   public EmployeePartime(float rate, float baseSalary){
       super(baseSalary);
       this.rate = rate;
   }
   public float getPartSalary(){
       return rate * super.getSalary();
   }
}
