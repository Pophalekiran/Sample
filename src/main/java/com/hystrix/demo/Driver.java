package com.hystrix.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        Employee e = new Employee(12,"Kiran");
        try {
            Employee e2= (Employee)e.clone();
            e.setEmpName("Rahul");
           // e.getDept().setDeptName("Electrical");
            System.out.println("Employee 2"+e2);


            MyInterface s=(a,b)->a+b;

            Mapper m=new Mapper();
            Function<Integer,String> f=(t)->t.toString()+"added Kiran" ;
            System.out.println(s.sayHello("Kiran ","Poohale"));
            List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
            List<String> strList=list.stream().map(m::apply).collect(Collectors.toList());

            System.out.println(strList);

//            List<String> list=new ArrayList<String>();
//            list.add("ankit");
//            list.add("mayank");
//            list.add("irfan");
//            list.add("jai");
//
//            list.forEach(
//                    (n)-> System.out.println("hhh "+n)
//            );
        } catch (CloneNotSupportedException e1) {
            e1.printStackTrace();
        }

    }
}
