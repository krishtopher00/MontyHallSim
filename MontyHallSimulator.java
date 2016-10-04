/**
* This program simulates the monty hall game x amount of times (x is a value the user puts in)
* It then returns the % of wins if the user switched, and % of wins if the user stayed
* @author Krish Bhavnani
* @version 1.0
*/
public class MontyHallSimulator{

  public static void main(String[] args){
    /**
    * Main method uses a for loop that calls game method
    * Has variable switchwins which will be incremented by the return value of the game method
    * Calculates percentage of switch wins by dividing score by total number of simulations
    * Prints results
    * @param args Command line argument that user enters
    * @return method does not return anything
    */
    int numSwitchWins = 0;
    int numSimulations = Integer.parseInt(args[0]);

    System.out.println("Monty Hall Game simulated " + numSimulations + " times");

    for(int i = 0; i < numSimulations; i++)
      numSwitchWins += game();
    double percentSwitchWin = (double) numSwitchWins / numSimulations * 100;

    percentSwitchWin = format(percentSwitchWin);

    System.out.println("Switch win %: " + percentSwitchWin);
    System.out.println("Stay win: " + (100 - percentSwitchWin) + "%");
  }
  public static double format(double d){
    /**
    * formats double into percentage
    * @param d double to be converted into percent format
    * @return double double in percent form
    */
    int x = (int)(d * 100);
    return (double)x / 100;
  }
  public static int game(){
    /**
    * Method that simulates game
    * Generates random position from 1-3 for car and guess
    * Method assumes user switches every time
    * If the car value =/= guess value, return 1 (simulating that if the user switched, they would win)
    * If the car value = guess value, return 0 (simulating that if the user switched, they would lose)
    */
    int car = (int)(Math.random() * 3 + 1);
    int guess = (int)(Math.random() * 3 + 1);

    if(car == guess)
      return 0;
    else
      return 1;
    }
}
