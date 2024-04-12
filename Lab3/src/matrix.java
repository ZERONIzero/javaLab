// package lab3.src;
import java.math.BigInteger;
import java.util.*;

public class matrix {
    public Scanner scan;
    protected int row,column;
    protected int matrix[][],res_matrix[][];

    matrix()
    {
        System.out.println("------------------------------");
        System.out.println("Запуск конструктора");
        System.out.println("------------------------------");
        scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите количество строк");
        System.out.print("M : ");
        row = Integer.parseInt(scan.nextLine());
        System.out.println("Введите количество столбцов");
        System.out.print("N : ");
        column = Integer.parseInt(scan.nextLine());
        matrix = new int[row][column];
        res_matrix = new int[row][column];
        for ( int i=0;i<row;i+=1)
        {
            for ( int j=0;j<column;j+=1)
            {
                this.matrix[i][j]=rand.nextInt(1000);
            }
        }
        System.out.println("------------------------------");
    }

    public void print_matrix()
    {
        System.out.println("------------------------------");
        System.out.println("Вывод исходной матрицы");
        System.out.println("------------------------------");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {   
                System.out.print("\t" + this.matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public void max_element()
    {
        System.out.println("------------------------------");
        System.out.println("Вывод максимального элемента матрицы");
        System.out.println("------------------------------");
        int max=this.matrix[0][0];
        for ( int i=0;i<row;i+=1)
        {
            for ( int j=0;j<column;j+=1)
            {
                if (this.matrix[i][j] > max)
                {
                    max = this.matrix[i][j];
                }
            }
        }
        System.out.println("max_element : "+max);
        System.out.println("------------------------------");
    }

    public void average()
    {
        System.out.println("------------------------------");
        System.out.println("Вывод среднего арифметического значения матрицы");
        System.out.println("------------------------------");
        int N = (this.column)*(this.row);
        int sum = 0;
        for ( int i=0;i<row;i+=1)
        {
            for ( int j=0;j<column;j+=1)
            {
                sum=sum+this.matrix[i][j];
            }
        }
        int result=sum/N;
        for ( int i=0;i<row;i+=1)
        {
            for ( int j=0;j<column;j+=1)
            {
                if (this.matrix[i][j]>result)
                {
                    this.res_matrix[i][j]=0;
                }
                else
                {
                    this.res_matrix[i][j]=this.matrix[i][j];
                }
            }
        }
        System.out.println("average : "+result);
        System.out.println("------------------------------");
    }

    public void print_result_matrix()
    {
        System.out.println("------------------------------");
        System.out.println("Вывод результирующей матрицы");
        System.out.println("------------------------------");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {   
                System.out.print("\t" + this.res_matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}