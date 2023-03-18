package org.example;

public class Author {
    public String name, gender, email;

    public Author(String name, String gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public String getAuthorname(){
        return this.name;
    }
    public String getAuthorgender(){
        return this.gender;
    }
    public String getAuthoremail(){
        return this.email;
    }

    public void setAuthorname(String name){
        this.name = name;
    }
    public void setAuthorgender(String gender){
        this.gender = gender;
    }
    public void setAuthoremail(String email){
        this.email = email;
    }


}
