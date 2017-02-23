
/**
 * Write a description of class Fles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fles
{
    // instance variables - replace the example below with your own
    private int inhoud;

    /**
     * Constructor for objects of class Fles
     */
    public Fles()
    {
        // initialise instance variables
        inhoud = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getInhoud()
    {
        return inhoud;
    }
    
    public void vullen()
    {
        /// dat is een klein flesje
        inhoud = 300;
    }
        
    public void bijvullen(int erbij)
    {
        inhoud =   inhoud + erbij;
    }
    
    public void legen()
    {
        inhoud = 0;
    }
    
    public void beterBijVullen(int erbij)
    {  
        inhoud =   inhoud + erbij;
        if (inhoud > 500)
           { inhoud = 500;
           }
    }
    
// dit type ik erbij
        
}
