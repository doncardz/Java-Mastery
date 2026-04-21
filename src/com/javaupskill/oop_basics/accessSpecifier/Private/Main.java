package com.javaupskill.oop_basics.accessSpecifier.Private;
class User {
    private String uname = "Carlo";

    public void setUname(String u) {
        uname = u;
    }

    public String getUname() {
        return uname;
    }

    void login() {
        System.out.println(uname);
    }
}
public class Main {
    public static void main(String[] args) {
        User usr = new User();
        //usr.uname("John"); Error, hindi pedeng mapaltan ang data dahil ito ay naka private, much safer and controlled.

    }
}
