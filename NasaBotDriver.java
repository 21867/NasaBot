import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NasaBotDriver implements Directions
{
    public static void main(String args[])
    {
        NasaBot karel = new NasaBot(9,2,South, 28);
        karel.showTime();
    }
    static
    {
    	World.reset();	
    	World.readWorld("nasabot.kwld");
    	World.setDelay(1);
    	World.setVisible(true);    	
    }
    
}
