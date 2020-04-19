/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 * @ modifier rizul
 *
 * I have created a different branch Rizul_Aujla because the branch I created
 * first was deleted as I had downloaded netbeans again
 */
public class Player implements Validator1 {

    @Override
    public boolean checklength(String s) {

        return s.length() >= 5;// return true if s is atleast 8

    }

    @Override
    public boolean checkSpecialCharacter(String s) {

        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        return s.matches(specialChars);  //return true if s matches to specialChars

    }

}
