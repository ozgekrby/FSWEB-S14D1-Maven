package com.workintech.developers;

public class MidDeveloper extends Employee{
    private long id;
    private String name;
    private int salary;
    public MidDeveloper(long id, String name, int salary){
        super(id, name, salary);
    }
    public void work(){
        System.out.println("MidDeveloper starts to working");
    }
    public void work(int salary){
        this.salary=salary;
    }
}
