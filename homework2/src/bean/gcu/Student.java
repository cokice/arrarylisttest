package bean.gcu;

public class Student {
    private String Name,aClass,Major,Grade;
    private String Num;
    public Student() {
    }

    public Student(String num, String name, String aClass, String major, String grade) {
        this.Num = num;
        this.Name = name;
        this.aClass = aClass;
        this.Major = major;
        this.Grade = grade;
    }


    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        Num = num;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getaClass() {
        return aClass;
    }

    public void setClass(String aClass) {
        this.aClass = aClass;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

}
