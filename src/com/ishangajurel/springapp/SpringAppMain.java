package com.ishangajurel.springapp;

import java.util.Scanner;

public class SpringAppMain {

    public static void main(String[] args) {
        SpringApp sapp = new SpringApp();
        Scanner sc = new Scanner(System.in);
        sapp.setAge(Integer.parseInt(sc.next()));
        System.out.println("Ishan Gajurel - Spring Application");
        System.out.println("**********************************");
        System.out.println("Age Input is");
        System.out.println(sapp.getAge());
    }
}