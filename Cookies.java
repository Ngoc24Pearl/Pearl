//Calculate the calories based on user input 

import javax.swing.JOptionPane;

public class Cookies{
  
  public static void main(String[]args){
    
  String userStringInput;
  double userNumberOfCookies;
  double userNumberOfCalories;
  double userNumberOfServing;
    
  //Declared variable 
  userStringInput = JOptionPane.showInputDialog("please enter the number of cookies");
  userNumberOfCookies = Double.parseDouble( userStringInput);
  userNumberOfServing = (userNumberOfCookies / 40 ) * 10;
  userNumberOfCalories = ( userNumberOfServing / 1 ) *300;
    
    JOptionPane.showMessageDialog( null,userNumberOfCookies + " cookies is eqaul to " + userNumberOfCalories +
                                  "calories (" + userNumberOfServing + "servings)");
    
    System.exit( 0 );
  }
}
  
