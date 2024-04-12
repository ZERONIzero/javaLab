package com.tech;

import java.util.ArrayList;

public class Student {
    public String Имя;
    public String Фамилия;
    public ArrayList<Integer> Оценки  = new ArrayList<Integer>();
    public ArrayList<Boolean> Посещение = new ArrayList<Boolean>();


    public Student(String Имя1,String Фамилия1,ArrayList<Integer> Оценки1,ArrayList<Boolean> Посещение1)
    {
        Имя=Имя1;
        Фамилия=Фамилия1;
        Оценки=Оценки1;
        Посещение=Посещение1;
    }

    public void print_student()
    {
        System.out.print(Имя+" ");
        System.out.println(Фамилия);
    }
}
