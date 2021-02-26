package com.company;

class myEmployee{
    private int id;
    private String name;
    public void setId(int i)
    {
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n)
    {
        name=n ;
    }
    public String getName(){
        return name ;
    }

}
public class Main {

    public static void main(String[] args) {
        myEmployee harshit=new myEmployee();
        harshit.setId(45);
        harshit.setName("garg");
        System.out.println(harshit.getId());
        System.out.println(harshit.getName());


    }
}
