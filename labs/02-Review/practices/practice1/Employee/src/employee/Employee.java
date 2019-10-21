/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

import com.example.domain.Engineer;

/**
 *
 * @author oracle
 */
public class Employee {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewEmployee employeeTest = new NewEmployee(101, "Jane Smith", "012-34-678", 102_34.27);
        NewEmployee doubleSalary = employeeTest.raiseSalary(employeeTest);
        Engineer engineer = new Engineer(101, "Jane Smith", "012-34-678", 102_34.27, 122F);
        System.out.println(employeeTest.getEmployeeSalary());
        System.out.println(doubleSalary.getEmployeeSalary());
        System.out.println(engineer.getBudget());
        
    }
}