package com.tech;

import java.util.*;
// import java.util.HashMap;
// import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        // // System.out.println("1 задание");
        // // System.out.println("----------------------------------------");
        // // System.out.println("Вася"+"\n"+"\t"+"пошёл"+"\n"+"\t"+"\t"+"гулять");
        // // System.out.println("----------------------------------------");
        // // System.out.println("2 задание");
        // // System.out.println("   Ж   "+"\n"+"  ЖЖЖ  "+"\n"+" ЖЖЖЖЖ "+"\n"+"ЖЖЖЖЖЖЖ"+"\n"+" НН НН "+"\n"+" ZZZZZ ");
        // // System.out.println("----------------------------------------");
        // // System.out.println("3 задание");
        // Scanner in = new Scanner(System.in);
        // // System.out.print("Input a number: ");
        // // int num = in.nextInt();
        // // System.out.println("last figure: "+num%10);
        // // System.out.println("----------------------------------------");
        // // System.out.println("4 задание");
        // // System.out.print("Input a number: ");
        // // int num1 = in.nextInt();
        // // System.out.println("Число десятков: "+num1/10);
        // // System.out.println("----------------------------------------");
        // // System.out.println("5 задание");
        // // System.out.print("Input a number: ");
        // // int num2 = 0;
        // // int sum = 0;
        // // for (num2 = in.nextInt();  num2!=0 ;num2/=10)
        // // {
        // //     sum+=(num2%10);
        // // }
        // // System.out.println("sum figure :"+sum);
        // // System.out.println("----------------------------------------");
        // // System.out.println("6 задание");
        // // System.out.print("Input a number: ");
        // // int num3=in.nextInt();
        // // // int res=0;
        // // System.out.println("next even number:"+((num3/2+1)*2));
        // // System.out.println("----------------------------------------");
        // // System.out.println("7 задание");
        // // System.out.print("Give me n-number: ");
        // // int num4=in.nextInt();
        // // int minutes=0;
        // // int hours=0;
        // // hours = num4 % (60 * 24) / 60;
        // // minutes = num4 % 60;
        // // System.out.println("Часов : "+ hours+" Минут : "+ minutes);
        // System.out.println("----------------------------------------");
        // System.out.println("10 задание");
        // System.out.print("Input number: ");
        // int num5=in.nextInt();
        // int num6=0;
        // int num7=0;
        // num6=num5*num5;
        // num7=num6*num6;
        // int result=num7*num7;
        // System.out.println(num5+" в степени 10 = "+(result*num6));
        // System.out.println("----------------------------------------");
        // System.out.println("9 задание");
        // System.out.print("Input number 1: ");
        // int number1=in.nextInt();
        // System.out.print("Input number 2: ");
        // int number2=in.nextInt();
        // System.out.print("Input number 3: ");
        // int number3=in.nextInt();
        // int res_sum=number1+number2+number3;
        // int res_mul=number1*number2*number3;
        // float sred=((float)res_sum/(float)3);
        // System.out.println("SUM: "+ res_sum + "\n" + "MUL: "+ res_mul +"\n" + "Среднее значение :" + sred);
        // System.out.println("----------------------------------------");
        // System.out.println("11 задание");
        // System.out.println("Give me n-number:");
        // int del_n=in.nextInt();
        // System.out.println("Give me m-number:");
        // int del_m=in.nextInt();
        // if (del_m%del_n==0 || del_n%del_n==0)
        // {
        //     System.out.println("1");
        // }
        // else
        // {
        //     System.out.println("0");
        // } 
        // System.out.println("----------------------------------------");
        // System.out.println("8 задание");
        // System.out.println("Give me lessons:");
        // int lessons=in.nextInt();
        // int res_final=9*60+(lessons-1)*45+45+((lessons-1)/2)*15+(lessons/2)*5;
        // System.out.println(res_final/60+":"+(res_final%60));
        
        

        // zadanie ob = new zadanie();
        // ob.InputArray();
        // Double Average=ob.Find_the_average_value();
        // ob.Make_list(Average);

        ArrayList<Integer> Оценки2  = new ArrayList<Integer>();
        Оценки2.add(5);
        Оценки2.add(5);
        Оценки2.add(5);
        Оценки2.add(5);
        ArrayList<Boolean> Посещение2  = new ArrayList<Boolean>();
        Оценки2.add(1);
        Оценки2.add(1);
        Оценки2.add(1);
        Оценки2.add(1);
        Student First = new Student("Arsen", "Karakeyan",Оценки2,Посещение2);
        // First.print_student();
        Map <Integer , Student> Оценки_студента = new HashMap<Integer,Student>();
        Оценки_студента.put(5, First);
        Schedule Algebra = new Schedule("Алгебра",Оценки_студента, "Heizenberg" );
        Algebra.Schedule_print();
        // in.close();

    }
}
