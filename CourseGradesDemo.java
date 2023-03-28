import java.util.Scanner;
/**
 * Description: This is the driver class that will create 5 object from the different classes inherited and then, and set them to course grades object
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class CourseGradesDemo
{
    /**
     * Description: this is the main method that will create a course grades object, input the values necessary to create 4 other objects (essay, finalexam, passfailexam and lab activity) and will set those objects to their respective setters from the course grades class     * @param nothing
     * @param args[]  as String
     * @return nothing
     * @throws nothing
     */   
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int missed;
        double score;
        int grammar;
        int spelling;
        int length;
        int content;
        int missedfinal;
        CourseGrades cr = new CourseGrades();
        GradedActivity lab = new GradedActivity();
        System.out.println("Enter the lab score given by the professor ");
        score = keyboard.nextDouble();
        lab.setScore(score);
        System.out.println("Enter the number of questions missed by the student on the exam ");
        missed = keyboard.nextInt();
        PassFailExam exam = new PassFailExam(10, missed, 70);
        System.out.println("Enter each part of grade of the essay \n Grammar: ");
        grammar = keyboard.nextInt();
        System.out.println("Spelling : ");
        spelling = keyboard.nextInt();
        System.out.println("Length : ");
        length = keyboard.nextInt();
        System.out.println("Content : ");
        content = keyboard.nextInt();
        Essay es = new Essay(grammar, spelling, length, content);
        System.out.println("Enter how many questions the student missed on the final exam ");
        missedfinal = keyboard.nextInt();
        FinalExam fi = new FinalExam(50, missedfinal);
        cr.setLab(lab);
        cr.setPassFailExam(exam);
        cr.setEssay(es);
        cr.setFinalExam(fi);
        System.out.println(cr);
    }


}
