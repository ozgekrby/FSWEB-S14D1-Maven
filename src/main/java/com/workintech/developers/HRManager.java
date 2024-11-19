package com.workintech.developers;

public class HRManager extends Employee{
    private long id;
    private String name;
    private int salary;
     public HRManager(long id, String name, int salary){
          super(id, name, salary);
      }
    public void work(){
        System.out.println("HRManager starts to working");
    }
    public void work(int salary){
        this.salary=salary;
    }


}
