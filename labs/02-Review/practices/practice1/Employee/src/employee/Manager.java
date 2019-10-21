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
public class Manager extends NewEmployee{

    public String getDeptName() {
        return deptName;
    }
    
    private String deptName;

    public Manager(int employeeId, String employeeName, String employeeSocialSecurityNumber, double employeeSalary, String deptName) {
        super(employeeId, employeeName, employeeSocialSecurityNumber, employeeSalary);
        this.deptName = deptName;
    }
    
}
