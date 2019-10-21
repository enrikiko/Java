/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.domain;

import employee.NewEmployee;

/**
 *
 * @author oracle
 */
public class Engineer extends NewEmployee{

    public double getBudget() {
        return budget;
    }
    
    private double budget;

    public Engineer(int employeeId, String employeeName, String employeeSocialSecurityNumber, double employeeSalary, double budget) {
        super(employeeId, employeeName, employeeSocialSecurityNumber, employeeSalary);
        this.budget = budget;
    }
    
}
