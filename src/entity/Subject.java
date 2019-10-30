package entity;

import java.io.Serializable;




public class Subject implements Serializable{

    private Long id;
    private String name;
    private Person teacher;

    public Subject() {
    }

    public Subject(String name, Person teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" 
                + ", name=" + name 
                + ", teacher=" + teacher.getName() + " " + teacher.getLastname() 
                + '}';
    }
    
    
    
}
