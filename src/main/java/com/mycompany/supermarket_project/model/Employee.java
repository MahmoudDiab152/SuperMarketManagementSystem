package com.mycompany.supermarket_project.model;



public class Employee extends user{
    private String phoneNumber;
    private int age;
    private String email;
    private String address;
    private String password;
    private String role;
    
    public Employee(long id,String name,String phoneNumber,int age,
        String email,String address,String password,String role){
        super(id, name);
//        this.id=id;
//        this.name=name;

        this.password=password;
        this.phoneNumber=phoneNumber;
        this.age=age;
        this.email=email;
        this.address=address;
        this.role=role;
    }

//    public long getId() {
//        return id;
//    }
//    
//    public void setId(long id){
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//    
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   
}
