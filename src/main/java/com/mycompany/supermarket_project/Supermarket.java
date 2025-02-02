package com.mycompany.supermarket_project;


import com.mycompany.supermarket_project.forms.logIn_form.LoginForm;
import com.mycompany.supermarket_project.model.Employee;

import utility.database;

public class Supermarket {
    public static database db = new database();
    public static Employee currentEmplyee=null;

    public static String[] employeeRoles={"Marketing","Inventory","Sales","Admin"};

    public static void signout(){
        currentEmplyee=null;
    }
    public static void main(String[] args) {
        new LoginForm().setVisible(true);
    }
}
