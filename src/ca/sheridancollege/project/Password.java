/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author DELL
 */
public class Password implements Validator1,Validator2{


    

    @Override
    public   boolean checklength(String s) {

        return s.length() >= 8;// return true if s is atleast 8

    }
    //method that check password contain atleast one uppercase character

    @Override
    public  boolean checkUppercase(String s) {

        String upperCaseChars = "(.*[A-Z].*)";
        return s.matches(upperCaseChars); //return true if s matches to uppercaseChars

    }
    //  method password contain atleast one special character

    @Override
    public  boolean checkSpecialCharacter(String s) {

        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        return s.matches(specialChars);  //return true if s matches to specialChars

    

}

 
}