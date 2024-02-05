package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        University university = new University();

        boolean exit = false;

        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                int selection = 0;
                String stringInput = sc.nextLine();
                selection = Integer.parseInt(stringInput);

                switch(selection) {
                    case 1:
                    System.out.println("Anna opiskelijan nimi?");
                    String name = sc.nextLine();
                    System.out.println("Anna opiskelijan opiskelijanumero:");
                    String studentnumberString = sc.nextLine();
                    if(!studentnumberString.isEmpty()){
                        int studentnumber = Integer.parseInt(studentnumberString);
                        Student newStudent = new Student(name,studentnumber);
                        university.addStudent(newStudent);
                    } else {
                        System.out.println("Opiskelijanumero ei voi olla tyhjä.");
                    }
                    
                    

                    break;

                    case 2:
                    System.out.println("Opiskelijat:");
                    university.listStudents();
                    break;

                    case 3:
                    List<Student> students = university.getStudents();
                    
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + ": " + students.get(i).getName());
                    }

                    System.out.println("Mille opiskelijalle suorite lisätään?");
                    int studentIndex = sc.nextInt();
                    sc.nextLine();
                    Student student = university.getStudents().get(studentIndex);
                    System.out.println("Mille kurssille suorite lisätään?");
                    String course = sc.nextLine();
                    System.out.println("Mikä arvosana kurssille lisätään?");
                    int grade = sc.nextInt();
                    Grade newGrade = new Grade(grade);
                    newGrade.setCourse(course);
                    student.addGrade(newGrade);
                    sc.nextLine();
                    

                    break;

                    case 4:
                    List<Student> studentss = university.getStudents();
                    
                    for (int i = 0; i < studentss.size(); i++) {
                        System.out.println(i + ": " + studentss.get(i).getName());
                    }
                    System.out.println("Minkä opiskelijan suoritteet listataan?");
                    int studentIndexPrint = sc.nextInt();
                    sc.nextLine();
                    Student studentPrint = university.getStudents().get(studentIndexPrint);
                    
                    List<Grade> grades = studentPrint.getGrades();
                    for (int i = 0; i < grades.size(); i++){
                        System.out.println(grades.get(i).getCourse() + ": " + grades.get(i).getGrade());
                    }
                    break;

                    case 5:
                    List<Student> studentsss = university.getStudents();
                    
                    
                    
                    for (int i = 0; i < studentsss.size(); i++) {
                        System.out.println(i + ": " + studentsss.get(i).getName());
                    }
                    
                    System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                    int studentIndexA=sc.nextInt();
                    sc.nextLine();
                    if (studentIndexA >= 0 && studentIndexA < studentsss.size()){
                        Student studentA = studentsss.get(studentIndexA);
                        double averageGrade = Calculator.calculateAverageGrade(studentA);
                        System.out.println("Keskiarvo on " + averageGrade);


                    }
                    break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit=true;
                        
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                

                }
            }
       
        }
        sc.close();
    }
}
