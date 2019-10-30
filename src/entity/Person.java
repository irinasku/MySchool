package entity;

import java.io.Serializable;


public class Person implements Serializable{

    private Long id;
    private String status;
    private String name;
    private String lastname;
    private int birthday;
    private int birthmonth;
    private int birthyear;
    
    public Person(){
    }

    public Person(String status, String name, String lastname, int birthday, int birthmonth, int birthyear) {
        this.status = status;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "Person{" 
                + ", status=" + status 
                + ", name=" + name 
                + ", lastname=" + lastname 
                + ", birthday=" + birthday 
                + ", birthmonth=" + birthmonth 
                + ", birthyear=" + birthyear 
                + '}';
    }
    
    
    
}