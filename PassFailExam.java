/**
 * Description: This class will calculate the grade for the exam assignment
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class PassFailExam extends PassFailActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    /**
     * Description: this constructor will calculate the value of the questions and then based on the argument passed, the grade will be calculated
     * @param questions, missed, minPassing as Integers
     * @return nothing
     * @throws nothing
     */
    public PassFailExam(int questions, int missed, double minPassing)
    {
        super(minPassing);
        double numericScore;
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        setScore(numericScore);
    }
    /**
     * Description: this method will return the value of each points on the exam
     * @param nothing
     * @return pointsEach
     * @throws nothing
     */
    public double getPointsEach()
    {
        return pointsEach;
    }
    /**
     * Description: this method will return the number of questions missed by the student on the exam
     * @param nothing
     * @return numMissed
     * @throws nothing
     */
    public int getNumMissed()
    {
        return numMissed;
    }
}
