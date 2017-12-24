package Program1;
import sofia.micro.jeroo.*;
import

//-------------------------------------------------------------------------
/**
 * this class is used to make the Kangroo pick all the flowers and
 * reach the center of the maps
 * through hopping, turning, and picking.
 *
 *  @author Haoran Xin(906135222)
 *  @version 2017/09/13
 */
public class ScavengerHunt extends LongIsland
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        // Nothing to initialize, leaving the world a default size
    }

    //~ Methods ...............................................................
    /**
     * this is main method
     * it make the kangroo pick all flowers
     * and reach to the center of the map
     */

    public void myProgram() {
        Kangroo andy = new Kangroo(2, 2);
        this.add(andy);
        andy.pickFirstFlower();
        andy.pickSecondFlower();
        andy.pickThirdFlower();
        andy.pickFourthFlower();
        andy.pickFifthFlower();
        andy.pickSixthFlower();
        andy.pickSeventhFlower();
        andy.pickEighthFlower();
    }
}

