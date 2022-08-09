package com.example.chapter2;

public class MyClass {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello sooraj");
        String name="This is my name";
        System.out.println(name.substring(1,3));
        float b1=5.33f;
        double b2=3.56;
        int a=35;
        int b=95;
        System.out.println(name);
        System.out.println(a+b);

//        if else conditionals;
        int var=6;
        if (var>45){
            System.out.println("The variable is greater than 45");
        }
        else{
            System.out.println("The variable is less than or equal to 45");
        }
//        loops in java
        for(int i=0;i<6;i++){
            System.out.println(i);
        }

    }
}