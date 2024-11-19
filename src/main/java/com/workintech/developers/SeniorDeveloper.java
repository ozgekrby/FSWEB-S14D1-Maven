package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    private long id;
    private String name;
    private int salary;
    public SeniorDeveloper(long id, String name, int salary){
        super(id, name, salary);
    }
    public void work(){
        System.out.println("SeniorDeveloper starts to working");
    }
    public void work(int salary){
        this.salary=salary;
    }
}
