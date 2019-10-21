/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author oracle
 */
public class NewEmployee  {
   
    private final int employeeId;
    private final String employeeName;
    private final String employeeSocialSecurityNumber;
    private final double employeeSalary;
    
    public NewEmployee(int employeeId, String employeeName, String employeeSocialSecurityNumber, double employeeSalary){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
    this.employeeSocialSecurityNumber = employeeSocialSecurityNumber;
    }
    
    
    public NewEmployee raiseSalary(NewEmployee employee) {
        return new NewEmployee(employee.getEmployeeId(), employee.getEmployeeName(), employee.getEmployeeSocialSecurityNumber(), employee.getEmployeeSalary()*2);
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSocialSecurityNumber() {
        return employeeSocialSecurityNumber;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    

}
