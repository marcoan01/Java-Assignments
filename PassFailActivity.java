/**
 * Description: This class will determine whether the student passed the exam or not
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class PassFailActivity extends GradedActivity
{
    private double minPassingScore;
    /**
     * Description: this constructor will set the argument passed to the minPassingscore variable
     * @param mps as Double
     * @return nothing
     * @throws nothing
     */
    public PassFailActivity(double mps)
    {
        minPassingScore = mps;
    }
   /**
     * Description: this method will determine the lettergrade based on the score given
     * @param nothing
     * @return lettergrade
     * @throws nothing
     */ 
   @Override
   public char getGrade()
   {
       char letterGrade;
       if(super.getScore() >= minPassingScore)
            letterGrade = 'P';
       else
            letterGrade = 'F';
       return letterGrade;
   }
}
