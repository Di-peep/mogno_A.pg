package com.helloworld;

import java.util.ArrayList;

public class Lab4 {



    public static void main(String[] args) {
        ArrayList<Student> students = Students.createStudents();
        students = Students.superSort(students);

        //for(Student i : students) {
        //    System.out.println(i);
        //}


    }
    public static class Students{
        public static ArrayList createStudents(){  // СОЗДАЕМ МАССИВ
            ArrayList<Student> students = new ArrayList<>();

            students.add(new Student(14, 8, 190, "Ivan" , "Zhukov"));
            students.add(new Student(15, 9, 170, "Grisha", "Pupin"));
            students.add(new Student(16 , 10, 183, "Aleksei", "Vanilin"));
            students.add(new Student(16 , 10, 182, "Vitalik", "Pachkin"));
            students.add(new Student(13, 7, 150, "Anton", "Ivanov"));
            return students;

        }
        public static ArrayList superSort(ArrayList<Student> students){
            for(int i = 0; i < students.size(); i++){  // СОРТИРОВКА ПО ВОЗРАСТАНИЮ ВОЗРАСТА
                for(int l = 0; i < students.size() ; i++){
                    if(students.get(l).age > students.get(l + 1).age){
                        Student inkognito = students.get(l);
                        students.set(l , students.get(l + 1));
                        students.set(l + 1, inkognito);
                    }
                }
            }

            for(int i = 0; i < students.size(); i++){  // СОРТИРОВКА ПО УБЫВАНИЮ РОСТА
                for(int l = 0; i < students.size() ; i++){
                    if(students.get(l).height < students.get(l + 1).height){
                        Student inkognito = students.get(l);
                        students.set(l , students.get(l + 1));
                        students.set(l + 1, inkognito);
                    }
                }
            }
            
            return students;
        }
    }
    public static class Student{
        int age;
        int clas;
        int height;
        String name;
        String surname;

        public Student(int age, int clas, int height,  String name, String surname){
            this.age = age;
            this.clas = clas;
            this.height = height;
            this.name = name;
            this.surname = surname;
        }

    }


}