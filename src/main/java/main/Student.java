package main;
import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private int studentnumber;
    private ArrayList<Grade> grades;

 

    public Student(String name, int studentnumber) {
        this.name=name;
        this.studentnumber=studentnumber;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        
        return name;

    }

    public int getStudentnumber() {
        return studentnumber;
    }

    public void addGrade(Grade grade){
        grades.add(grade);

    }
    public ArrayList<Grade> getGrades(){
        return grades;
    }
}
