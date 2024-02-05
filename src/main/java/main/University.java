package main;
import java.util.ArrayList;
import java.util.List;
public class University {
    private ArrayList<Student> students;
    private ArrayList<Student> studentnumbers;
    

    public University(){

        this.students = new ArrayList<>();
        this.studentnumbers = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        studentnumbers.add(student);
    }

 
    
    public void listStudents(){
        for (Student student : students){
            
            System.out.println(student.getStudentnumber()+": "+student.getName());
            
        }
    }

    public ArrayList<Student> getStudents(){
        return students;

    }
}
