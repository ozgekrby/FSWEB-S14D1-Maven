package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    private long id;
    private String name;
    private int salary;
    public JuniorDeveloper(long id, String name, int salary){
        super(id, name, salary);
    }
    public void work(){
        System.out.println("JuniorDeveloper starts to working");
    }
    public void work(int salary){
        this.salary=salary;
    }
}
