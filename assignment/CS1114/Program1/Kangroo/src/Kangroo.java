
import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  this method is used to creat a Kangroo extends
 *  from Jeroo and this class also define hopStraight, turnCorner
 *  method to help the Kangroo pick all the flowers and reach the
 *  center of the map
 *
 *  @author your Haoran Xin(906135222)
 *  @version 2017/09/13
 */
public class Kangroo extends Jeroo
{
    //~ Fields ................................................................

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Kangroo object.
     * @param x represent the x-coordinate of Kangroo
     * @param y represent the y-coordinate of kangroo
     */
    public Kangroo(int x, int y)
    {
        /*# Do any work to initialize your class here. */
        super(x, y);
    }

    //~ Methods ...............................................................
    /**
     * this method is used to hop three
     * square at one time
     */
    public void hopStraight() {
        this.hop();
        this.hop();
        this.hop();
    }

    /**
     * this method is used to turn corner
     * through turn around and hop
     *
     */
    public void turnCorner() {
        this.turn(RIGHT);
        this.hop();
        this.turn(LEFT);
        this.hop();
        this.turn(RIGHT);
    }

    /**
     * this method is used to pick the first flower
     * it makes Kangroo turn, hop, and pick
     */

    public void pickFirstFlower() {
        this.turn(RIGHT);
        this.hop();
        this.hop();
        this.turn(LEFT);
        this.hopStraight();
        this.turn(LEFT);
        this.hopStraight();
        this.pick();
    }

    /**
     * this method is used to pick the second flower
     * through turning, hopping and picking
     */

    public void pickSecondFlower() {
        this.turn(RIGHT);
        this.hopStraight();
        this.pick();
    }

    /**
     * this method is used to pick the third flower
     * through calling hopStraight method and hoping and
     * picking
     */

    public void pickThirdFlower() {
        this.hopStraight();
        this.hop();
        this.pick();
    }

    /**
     * this method is used to pick the fourth flower
     * through calling turnCorner method, hopStraight methods twice,
     * hopping and picking
     */

    public void pickFourthFlower() {
        this.turnCorner();
        this.hopStraight();
        this.hopStraight();
        this.hop();
        this.pick();
    }

    /**
     * this method is used to pick fifth flower
     * through turning, hopping and picking
     */

    public void pickFifthFlower() {
        this.turn(RIGHT);
        this.hop();
        this.hop();
        this.pick();
    }

    /**
     * this method is used to make the Kangroo pick
     * the sixth flower by calling hopStraight method and
     * picking
     */

    public void pickSixthFlower() {
        this.hopStraight();
        this.pick();
    }

    /**
     * this method is used to make Kangroo pick
     * seventh flower by turning, hopping and picking
     */

    public void pickSeventhFlower() {
        this.turn(RIGHT);
        this.hop();
        this.turn(LEFT);
        this.hop();
        this.hop();
        this.turn(LEFT);
        this.hop();
        this.pick();
    }

    /**
     * this method is used to make Kangroo pick eighth flower
     * by turning, hopping, calling hopStraight method, and picking
     */

    public void pickEighthFlower() {
        this.turn(LEFT);
        this.turn(LEFT);
        this.hopStraight();
        this.hopStraight();
        this.turn(RIGHT);
        this.hopStraight();
        this.turn(RIGHT);
        this.hop();
        this.hop();
        this.pick();
    }
}
