package main;
import java.util.List;
public class Grade {
    private int grade;
    private String course;

    public Grade(int grade) {
        this.grade=grade;
    }
    public int getGrade(){
        return grade;


    }
    public String getCourse(){
        return course;
    }
    
    public void setCourse(String course){
        this.course=course;
    }
}
