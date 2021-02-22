package com.company;
class employee{
    int id;
    String name;
    public void print(){
        System.out.println("the id  is " +id);
        System.out.println("and my name is "+name);
    }
}
public class Main {

    public static void main(String[] args) {
        employee harshit =new employee();
        employee raghhav=new employee();
        raghhav.id=47;
        raghhav.name="R";
        harshit.id=69602;
        harshit.name="R";
        //System.out.println(harshit.id);
        harshit.print();
        raghhav.print();

    }
}
