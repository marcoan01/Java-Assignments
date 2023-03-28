/**
 * Description: This class will calculate the grade for the essay assignment
 * Class: Fall - COSC 1437.81003
 * Assignment10: Course Grades
 * Date: 11/27/2018
 * @author Marco Delgado
 * @version 1.0.0
 */
public class Essay extends GradedActivity
{
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    private int total;
    /**
     * Description: this constructor will set the arguments into their respective setters
     * @param gr, sp, le, co as Integers
     * @return nothing
     * @throws nothing
     */
    public Essay(int gr, int sp, int le, int co)
    {
        setGrammar(gr);
        setSpelling(sp);
        setLength(le);
        setContent(co);
        setTotal();
        setScore(getTotal());
        
    }
    /**
     * Description: this method will set the argument to the grammar variable
     * @param grammar as Integer
     * @return nothing
     * @throws nothing
     */
    public void setGrammar(int grammar)
    {
        this.grammar = grammar;
    }
    /**
     * Description: this method will set the argument to the spelling variable
     * @param spelling as Integer
     * @return nothing
     * @throws nothing
     */
    public void setSpelling(int spelling)
    {
        this.spelling = spelling;
    }
    /**
     * Description: this method will set the argument to the length variable
     * @param length as Integer
     * @return nothing
     * @throws nothing
     */
    public void setLength(int length)
    {
        this.length = length;
    }
    /**
     * Description: this method will set the argument to the content variable
     * @param content as Integer
     * @return nothing
     * @throws nothing
     */
    public void setContent(int content)
    {
        this.content = content;
    }
    /**
     * Description: this method will calculate the total of the essay and set that score into the total variable
     * @param nothing
     * @return nothing
     * @throws nothing
     */
    public void setTotal()
    {
        int grade;
        grade = grammar + spelling + length + content;
        this.total = grade;
    }
    /**
     * Description: this method will return the total of the essay
     * @param nothing
     * @return total
     * @throws nothing
     */
    public int getTotal()
    {
        return total;
    }
}
