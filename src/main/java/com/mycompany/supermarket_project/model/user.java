package com.mycompany.supermarket_project.model;

public class user {
    private long id;
    private String name;
    
    public user(long id, String name){
        this.id = id;
        this.name = name;
    }
    
    public  long getId(){
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
