package utility.database_navigation;

import java.sql.*;
import com.mycompany.supermarket_project.model.Employee;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.supermarket_project.Supermarket;

public class employeeDB {

    public Employee getEmplyeeById(long id) {
        ResultSet res = Supermarket.db.selectQuery("select * from Employee where id = " + id);
        try {
            Employee emp = new Employee(
                    res.getLong("id"),
                    res.getString("name"),
                    res.getString("phoneNumber"),
                    res.getInt("age"),
                    res.getString("email"),
                    res.getString("address"),
                    res.getString("password"),
                    res.getString("role"));
            if (emp.getName() != null) {
                return emp;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int addEmployee(String name, String phoneNumber, int age, String email, String address, String password,
            String role) {
        String query = "INSERT INTO Employee(name,phoneNumber,age,email,address,password,role) VALUES(";
        query = query + "'" + name + "',";
        query = query + "'" + phoneNumber + "',";
        query = query + age + ",";
        query = query + "'" + email + "',";
        query = query + "'" + address + "',";
        query = query + "'" + password + "',";
        query = query + "'" + role + "')  RETURNING *";

        System.out.println(query);
        int res = Supermarket.db.insertQuery(query);
        return res;
    }

    public boolean isPasswordCorrect(String password, long id) {
        ResultSet res = Supermarket.db.selectQuery("select * from Employee where id = " + id);
        try {
            if (res.getString("password").equals(password)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Employee> getAllEmployees() {
        ResultSet res = Supermarket.db.selectQuery("select * from Employee");
        List<Employee> employees = new ArrayList<>();
        try {
            while (res.next()) {
                Employee emp = new Employee(
                        res.getLong("id"),
                        res.getString("name"),
                        res.getString("phoneNumber"),
                        res.getInt("age"),
                        res.getString("email"),
                        res.getString("address"),
                        res.getString("password"),
                        res.getString("role"));
                employees.add(emp);
            }
            return employees;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int updateEmployeeById(
                Long id,
                String name,
                String phoneNumber,
                int age,
                String email,
                String address,
                String password,
                String role
        ) {
            String query = "UPDATE Employee SET ";
            query = query + "name = '"+name+"',";
            query = query + "phoneNumber = '"+phoneNumber+"',";
            query = query + "age = "+age+",";
            query = query + "email = '"+email+"',";
            query = query + "address = '"+address+"',";
            query = query + "password = '"+password+"',";
            query = query + "role = '"+role+"' ";
            query = query + "where id = "+id;

            System.out.println(query);
            int res = Supermarket.db.insertQuery(query);
            return res;
    }
    public int deleteEmployeeById(Long id){
        String query = "delete from  Employee where id = " + id;
        int res = Supermarket.db.insertQuery(query);
        return res;
    }
}
