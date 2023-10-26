package com.HelloUser.hellouser;

public class User {
    private String fname;
    private String lname;
    private String mailadress;
    private String password;

    public User(String fname, String lname, String mailadress, String password) {
        this.fname = fname;
        this.lname = lname;
        this.mailadress = mailadress;
        this.password = password;
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

    public String getMailadress() {
        return mailadress;
    }

    public void setMailadress(String mailadress) {
        this.mailadress = mailadress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    

    

}
