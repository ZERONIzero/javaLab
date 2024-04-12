package com.tech;
import java.util.*;
// import java.util.HashMap;

public class Schedule {

    public String Название_предмета;
    public Map<Integer,Student> Список_успеваемости = new HashMap<Integer,Student>();
    public String Фамилия_учителя;
    
    public Schedule(String Название_предмета1,Map<Integer,Student> Список_успеваемости1,String Фамилия_учителя1)
    {
        Название_предмета=Название_предмета1;
        Список_успеваемости=Список_успеваемости1;
        Фамилия_учителя=Фамилия_учителя1;
    }
    
    public void Schedule_print()
    {
        System.out.print(Название_предмета+" | ");
        System.out.println("Преподаватель дисциплины : "+Фамилия_учителя);
        for(Map.Entry<Integer, Student> item : Список_успеваемости.entrySet()){
         
            System.out.printf("%s\n", item.getKey() );
            item.getValue().print_student();
        }
    }
    
}
