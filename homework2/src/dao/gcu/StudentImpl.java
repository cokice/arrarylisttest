package dao.gcu;

import bean.gcu.Student;
import db.gcu.Studentcl;
import service.gcu.IStudentDao;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentImpl implements IStudentDao {
    Student s = new Student();
    Scanner sc = new Scanner(System.in);
    @Override
    public void add(ArrayList<Student> array) {
        System.out.println("请输入学号");
        String id = sc.nextLine();
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年级");
        String Grade = sc.nextLine();
        System.out.println("请输入班级");
        String Class = sc.nextLine();
        System.out.println("请输入专业");
        String major = sc.nextLine();
        s.setNum(id);
        s.setName(name);
        s.setGrade(Grade);
        s.setClass(Class);
        s.setMajor(major);
        array.add(s);
        System.out.println("OK");

    }

    @Override
    public void edit(ArrayList<Student> array) {
        System.out.println("输入要修改的学号");
        String id = sc.nextLine();
        System.out.println("请输入新姓名");
        String name = sc.nextLine();
        System.out.println("请输入新年级");
        String Grade = sc.nextLine();
        System.out.println("请输入新班级");
        String Class = sc.nextLine();
        System.out.println("请输入新专业");
        String major = sc.nextLine();
        s.setName(name);
        s.setGrade(Grade);
        s.setClass(Class);
        s.setMajor(major);
        for (int i=0;i<array.size();i++){
            //Student student = array.get(i);
            if (s.getNum().equals(id)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改成功");
    }

    @Override
    public void serch(ArrayList<Student> array) {
        System.out.println("请输入学号");
        String id = sc.nextLine();
        for (int i=0;i<array.size();i++){
            if(id.equals(s.getNum())){
                System.out.println("信息:{" +
                        "学号='" + s.getNum() + '\'' +
                        ", 姓名='" + s.getName() + '\'' +
                        ", 年级='" + s.getGrade() + '\'' +
                        ", 班级='" + s.getaClass() + '\'' +
                        ", 专业=" + s.getMajor() +
                        '}');
                break;
            }else{
                System.out.println("未找到");
            }
        }
    }

    @Override
    public void delete(ArrayList<Student> array) {
        System.out.println("请输入要删除的学号");
        String id = sc.nextLine();
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getNum().equals(id)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除成功");

    }
}
