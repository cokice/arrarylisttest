package test.gcu;

import bean.gcu.Student;
import dao.gcu.StudentImpl;
import db.gcu.Studentcl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentImpl s = new StudentImpl();
        ArrayList<Student> array = new ArrayList<>();
        //Student s = new Student();
        while (true) {
            System.out.println("---学生管理系统---");
            System.out.println("---1添加学生信息---");
            System.out.println("---2修改学生信息---");
            System.out.println("---3查询学生信息---");
            System.out.println("---4删除学生信息---");
            System.out.println("---0退出系统---");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    s.add(array);
                    break;
                case 2:
                    s.edit(array);
                    break;
                case 3:
                    s.serch(array);
                    break;
                case 4:
                    s.delete(array);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }



    }
}
