package main;
import java.util.List;
public class Calculator {
    public static double calculateAverageGrade(Student student) {
        List<Grade> grades = student.getGrades();
        if (grades.isEmpty()){
            return 0.0;
        }

        int sumGrade=0;
        for (Grade grade : grades){
            sumGrade += grade.getGrade();
        }
        return (double) sumGrade / grades.size();



    }
}

