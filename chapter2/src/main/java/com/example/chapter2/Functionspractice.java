package com.example.chapter2;

public class Functionspractice {
    public static double average(int a,int b,int c){
        return(a+b+c)/3.0;
    }
    public static double averageplusone(int a,int b,int c){
        double d=(a+b+c)/3.0;
        return d+1;
    }
    public static void main(String[] args){
        int a=65;
        int b=5;
        int c=78;
        double avg=(a+b+c)/3.0;
        System.out.println(avg);
        System.out.println(average(1,2,3));
        System.out.println((averageplusone(1,2,3)));
    }
}
