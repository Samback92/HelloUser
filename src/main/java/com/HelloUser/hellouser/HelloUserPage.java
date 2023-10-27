package com.HelloUser.hellouser;

import java.util.ArrayList;

public class HelloUserPage {

    public String helloUserPageName;
    ArrayList<User> users;

    HelloUserPage(String helloUserPageName) {
        this.helloUserPageName = helloUserPageName;
        this.users = new ArrayList<>();
    }

    public void addUser(String fname, String lname, String mailadress, String password) {
        users.add(new User(fname, lname, mailadress, password));
    }

    public String getHelloUserPageName() {
        return helloUserPageName;
    }

    public void setHelloUserPageName(String helloUserPageName) {
        this.helloUserPageName = helloUserPageName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
}
