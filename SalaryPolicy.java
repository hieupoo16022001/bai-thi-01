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
abstract public class SalaryPolicy{
    private float baseSalary;
    public SalaryPolicy(float baseSalary){
        this.baseSalary = baseSalary;
    }

    
    public void setSalary(float newSalary){
        this.baseSalary = newSalary;
    }
 public float getSalary(){
     return this.baseSalary;
  }
 
    
}
