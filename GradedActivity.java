/**
 * Description: This class will be the superclass that will calculate the scores for each class
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class GradedActivity
{
    private double score;
    
    
    /**
     * Description: this method will set the argument to the score variable
     * @param s as Double
     * @return nothing
     * @throws nothing
     */
    public void setScore(double s)
    {
        score = s;
    }
    /**
     * Description: this method will return the value of the score variable
     * @param nothing
     * @return score
     * @throws nothing
     */
    public double getScore()
    {
        return score;
    }
    /**
     * Description: this method will determine the letter grade based on the score
     * @param nothing
     * @return letterGrade
     * @throws nothing
     */
    public char getGrade()
    {
        char letterGrade;
        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}



