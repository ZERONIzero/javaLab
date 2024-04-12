package com.tech;

import java.util.Scanner;
import java.util.ArrayList;

public class zadanie {
    private int N;
    private ArrayList<Double> aa = new ArrayList<Double>();
    
    public void InputArray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите количество чисел ");
        N=sc.nextInt();

        double a;
        for(int i=0; i<N ;i++)
        {
            System.out.print("Введите число " + String.valueOf(i+1) + ":");
            a=sc.nextDouble();
            aa.add(a);
        }
        sc.close();
    }

    public double Find_the_average_value()
    {
        double b=0;
        System.out.print("Среднее значение array :");
        for (int i=0 ; i<N ; i++)
        {
            b=b+aa.get(i);
        }
        b=b/N;
        System.out.println(b);
        return b;
    }

    public void Make_list(double b)
    {
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (int i=0 ; i<N ; i++)
        {
            if (b > aa.get(i))
            {
                test.add(1);
            }
            else if ( b < aa.get(i))
            {
                test.add(0);
            }
            else if (b == aa.get(i))
            {
                test.add(-1);
            }
        }
        for (int i1=0 ; i1<N ; i1++)
        {
            System.out.println(test.get(i1));
        }

    }


}
