package service.gcu;

import bean.gcu.Student;

import java.util.Scanner;
import java.util.ArrayList;
public interface IStudentDao {
    void add(ArrayList<Student> array);
    void edit(ArrayList<Student> array);
    void serch(ArrayList<Student> array);
    void delete(ArrayList<Student> array);

}
