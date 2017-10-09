package com.yoelee.algorithms.t2_array;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * ArrayList按照内部元素排序
 */
public class ArrayListSort {

    public static class Student{
        String name = null;
        int age = -1;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString(){
            return "name:"+this.name+";age="+this.age;
        }
    }

    public static void main(String [] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("liming",26));
        students.add(new Student("hanleilei",19));
        students.add(new Student("lily",24));
        students.add(new Student("lucy",23));
        System.out.println(students.toString());
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = -1;
                if(o1.age > o2.age){
                    result = 1;
                }
                return result;
            }
        });
        System.out.println(students.toString());
    }
}
