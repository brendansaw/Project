package TileAction;
import Characters.*;
import Core.Game;

/**
 * Checkpoint class implements the Reward interface.
 * Contains method to update player score by the
 * value of the object.
 * Also holds the static value of checkpoints left and
 * updates this value accordingly.
 *
 * @author Brendan
 * @author Stephen Dao
 * @version 1.0
 * @since 1.0
 */
public class Checkpoint implements Reward {
    private static int checkpointsLeft = 0;
    int scoreIncreaseValue = 50;

    public Checkpoint() {
        checkpointsLeft += 1;
        //System.out.println(checkpointsLeft);
    }

    /**
     * Getter for number of checkpoints left.
     */
    public static int getCheckpointsLeft() {
        return checkpointsLeft;
    }

    /**
     * Updates player score by value of reward and
     * updates number of checkpoints left.
     */
    @Override
    public void updatePlayerScore() {
        Game.updateScore(scoreIncreaseValue);
        checkpointsLeft -= 1;
        //System.out.println(Game.score);
        /*
        mainCharacter.increasePlayerScore(scoreIncreaseValue);
         */
    }

    /**
     * Setter for checkpointsleft.
     *
     * @param x an int corresponding to a number of checkpoints
     */
    public static void setCheckpointsLeft(int x) {
        checkpointsLeft = x;
    }
}
