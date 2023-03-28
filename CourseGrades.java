/**
 * Description: This class will simulate the 4 course grades and will put them all together in an array
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class CourseGrades
{
     private GradedActivity grades [];
     private final int NUM_GRADES = 4;
     /**
     * Description: this constructor will create an array of 4 objects from the classes inherited
     * @param nothing
     * @return nothing
     * @throws nothing
     */   
     public CourseGrades()
     {
         grades = new GradedActivity[NUM_GRADES];
        }
     /**
     * Description: this method will set the object passed as an argument to the first element of the array
     * @param aLab as GradedActivity
     * @return nothing
     * @throws nothing
     */
        public void setLab(GradedActivity aLab)
     {
         grades[0] = aLab;
     }
     /**
     * Description: this method will set the object passed as an argument to the second element of the array
     * @param aPassFailExam as PassFailExam
     * @return nothing
     * @throws nothing
     */
     public void setPassFailExam(PassFailExam aPassFailExam)
     {
         grades[1] = aPassFailExam;
        }
     /**
     * Description: this method will set the object passed as an argument to the third element of the array
     * @param aEssay as Essay
     * @return nothing
     * @throws nothing
     */
        public void setEssay(Essay aEssay)
     {
         grades[2] = aEssay;
        }
     /**
     * Description: this method will set the object passed as an argument to the fourth element of the array
     * @param aFinalExam as FinalExam
     * @return nothing
     * @throws nothing
     */
        public void setFinalExam(FinalExam aFinalExam)
     {
        grades[3] = aFinalExam;
        }
     /**
     * Description: this method will return a string object that will hold the information of the scores and the letter grades
     * @param nothing
     * @return str 
     * @throws nothing
     */
        public String toString()
   {
      String str = "Lab Score: " + grades[0].getScore() +
                   "\tGrade: " + grades[0].getGrade() +
                   "\nPass/Fail Exam Score: " + grades[1].getScore() +
                   "\tGrade: " + grades[1].getGrade() +
                   "\nEssay Score: " + grades[2].getScore() +
                   "\tGrade: " + grades[2].getGrade() +
                   "\nFinal Exam Score: " + grades[3].getScore() +
                   "\tGrade: " + grades[3].getGrade();
      
      return str;
   }
}
