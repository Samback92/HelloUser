package com.HelloUser;

public class User {

    private String fname;
    private String lname;
    private String email;
    private int id;

    public User(String fname, String lname, String email, int id) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.id = id;
    }

    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    
}
