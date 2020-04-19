/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @ modifier Inderjeet Kaur
 *
 * She had some technical issue in her device so she is not able to perform
 * commits and push the code in the git repository but she completed the part
 * assigned to her and sent this code to me and at her place I'm performing a
 * commit and push in get repository on git hub
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    public String color;
    public int value;
    private Random rand;
    private String face;

    public GroupOfCards(int v, String c) {
        value = v;
        color = c;
    }

    // Creates a random card
    public GroupOfCards() {
        rand = new Random();
        value = rand.nextInt(28); // 108 cards in a standard Uno deck. Can be reduced to 27 (disregarding colors)
        // Assigning value
        if (value >= 14) // Some cards are more common than others
        {
            value -= 14;
        }
        // Assigning color
        rand = new Random();
        switch (rand.nextInt(4)) {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Yellow";
                break;
        }
        // If the card is a wild card
        if (value >= 13) {
            color = "none";
        }
    }

    public String getFace() {
        /* Returns the face of the card (what the player sees)
         * Ex. [Red 5]
         */
        face = "[";
        if (color != "none") {
            face += this.color + " ";
        }

        switch (this.value) {
            default:
                face += String.valueOf(this.value);
                break;
            case 10:
                face += "Skip";
                break;
            case 11:
                face += "Reverse";
                break;
            case 12:
                face += "Draw 2";
                break;
            case 13:
                face += "Wild";
                break;
            case 14:
                face += "Wild Draw 4";
                break;
        }
        face += "]";
        return face;
    }

    // Determines if you can place this card on top of a given card
    // The color needs to be specified because if a wild card was chosen in the previous round,
    //the color would have changed, but the card staying the same
    public boolean canPlace(GroupOfCards o, String c) {
        if (this.color == c) {
            return true;
        } else if (this.value == o.value) {
            return true;
        } else if (this.color == "none") // Wild cards
        {
            return true;
        }
        return false;
    }

}//end class
