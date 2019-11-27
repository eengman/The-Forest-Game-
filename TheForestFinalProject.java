//Name: Eric Engman
//Date: 5/2/18
//Description: Final Project called The Forest

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class TheForestFinalProject{
    
    //Greeting
   public static String greeting() {
      Scanner input = new Scanner(System.in);
      
         //Declare variables: name 
         
      String name;
      System.out.println("-----------------------------------------------------");
      System.out.println("");
      System.out.println("Hello, and welcome to the game called The Forest!!!");
      System.out.println("");
         
      System.out.print("Introduction: ");
      System.out.println("You wake up in a forest surrounded by trees. ");
      System.out.println("You do not remember how you got there, you only know that you must ");
      System.out.print("get back home before dinner. You have a feeling tonight is pizza night...");
      System.out.println(" and you love pizza...");
      System.out.println("");
      System.out.println("");
      System.out.println("---------------------------------");
      System.out.println("Press Enter");
      input.nextLine();
      System.out.println("The goal is simple, try and find you way back home... alive... ");
      System.out.println("They say that dangerous creatures inhabit these woods...");
      System.out.println("");
         
      System.out.println("Goodluck!!!");
      System.out.println("");
      System.out.println("---------------------------------");
      System.out.println("Press Enter");
      input.nextLine();
      System.out.println("");
      System.out.println("Oh and I almost forgot! ");
      System.out.println("What is your name?");
      System.out.println("");
      name = input.nextLine();
      System.out.println("");
      System.out.println("Hello " + name + ", I wish you luck on this adventure!");
      System.out.println("");
      System.out.println("Press Enter");
      System.out.println("-----------------------------------------------------");
      input.nextLine();
      return name;
   }
   //Method for cave
   public static void cave(){
      
      Scanner input = new Scanner(System.in);
      
      int answer;
         
      System.out.println("---------------------------------");
      System.out.println("");
      System.out.println("You find a trail begin walking down it");
      System.out.println("");
      System.out.println("You come across a cave...");
      System.out.println("");
      System.out.println("What do you do?                  *");
      System.out.println("                               *    *");
      System.out.println("1: Go inside Cave            *   *    * *");
      System.out.println("2: Turn back                *  *   *     *");
      System.out.println("                          **   *   *       ** ");
      System.out.println("---------------------------------");
      answer = input.nextInt();
         
      switch(answer){
         case 1:
            input.nextLine();           
            System.out.println("");
            System.out.println("You walk up to the cave");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            break;
         case 2:
            System.out.println("---------------------------------");
            System.out.println("");
            System.out.println("This is the only way home!!! You can't go back!");
            System.out.println("");
            System.out.println("");
            System.out.println("You reluctantly walk up to the cave");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            break;
         default:
            System.out.println("**That was not one of the options!**");
            System.out.println("");
            System.out.println("You walk up to the cave because you cannot follow");
            System.out.println("instructions");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            break;
         
      }
         
         
   }//cave

   //Method for the hobo you encounter outside of the cave
   public static int hobo(){
      Scanner input = new Scanner(System.in);
      
      int playerScore;
      int answer;
      int difficulty;
      System.out.println("---------------------------------------");
      System.out.println("");
      System.out.println("You see a hobo sitting outside of it");
      System.out.println("");
      System.out.println("Hobo: Hello weary traveler, do you have any apples to spare?");
      System.out.println("");
      System.out.println("1: Give the hobo an apple");
      System.out.println("2: No these are my apples");
      System.out.println("");
      System.out.println("---------------------------------------");
      answer = input.nextInt();
      if(answer == 1){
         System.out.println("** You give the hobo an apple **");
         System.out.println("");
         System.out.println("Hobo: Aww thank you kind traveler!");
         System.out.println("");
         System.out.println("** +50 score for being nice **");
         System.out.println("");
         System.out.println("Press Enter");
         System.out.println("");
         input.nextLine();
         input.nextLine();
         playerScore = 50;     
      }
      else{
         System.out.println("Hobo: Okay okay, you didn't have to be so mean!");
         playerScore = 0;
      }
      return playerScore;  
   }
   //Method where you find a weapon
   public static int weaponFind(){
      Scanner input = new Scanner(System.in);
      
      int answer;
      int option1;
      int option2;
      int option3;
      int weaponAnswer;
      int damage = 0;
         
      Sword wSword = new Sword();
      Axe wAxe = new Axe();
      Club wClub = new Club();
      noWeapon fist = new noWeapon();
      
      System.out.println("");  
      System.out.println("You wake up and don't know where you are...");
      System.out.println("");
      System.out.println("You must find your way home and fast... Its pizza night...");
      System.out.println("");
      System.out.println("");
      System.out.println("Press Enter");
      System.out.println("----------------------------------------------");
      input.nextLine();
      
      System.out.println("You look around and see a bag near a bush...");
      System.out.println("");
      System.out.println("What do you do?");
      System.out.println("");
      System.out.println("1: Open the bag");
      System.out.println("2: Leave it there");
      System.out.println("");
      answer = input.nextInt();
      System.out.println("------------------------------------");
         
      if(answer == 1) {
         
         System.out.println("You open the bag and find a sword, an axe, and a club!");
         System.out.println("");
         System.out.println("Which one do you want?");
         System.out.println("");
         System.out.println("1: Sword");
         System.out.println("2: Axe");
         System.out.println("3: Club");
         answer = input.nextInt();
         if(answer == 1){
            System.out.println("                         * ");
            System.out.println("You chose the sword!!     * ");
            System.out.println("                           * ");
            System.out.println("                          --*-- ");
            System.out.println("                             * ");
            System.out.println("---------------------------------");
            System.out.println("Press Enter to Continue");
            //Set weapon damage if they chose the sword
            wSword.setDamage(60);
            damage = wSword.getDamage(damage);
            input.nextLine();
            input.nextLine();
         }
         if(answer == 2){
            System.out.println("                       **| ");
            System.out.println("You chose the axe!!   ***| ");
            System.out.println("                        *| ");
            System.out.println("                         | ");
            System.out.println("                         | ");
            System.out.println("---------------------------------");
            System.out.println("Press Enter to Continue");
            //Set weapon damage if they chose the axe
            wAxe.setDamage(50);
            damage = wAxe.getDamage(damage);
            input.nextLine();
            input.nextLine();
         }
      
         if(answer == 3){
            System.out.println("                      _ ");
            System.out.println("You chose a club!    | | ");
            System.out.println("                     | | ");
            System.out.println("                     | | ");
            System.out.println("                     || ");
            System.out.println("                     || ");
            System.out.println("---------------------------------");
            System.out.println("Press Enter to Continue");
            //Set weapon damage if they chose the club
            wClub.setDamage(40);
            damage = wClub.getDamage(damage);
            input.nextLine();
            input.nextLine();
         }
         
         if (answer >= 4){
            System.out.println("");
         System.out.println("You choose not to have a weapon!");
         System.out.println("");
         System.out.println("Press Enter");
         //Damage if no weapon is chosen
         fist.setDamage(10);
         damage = fist.getDamage(damage);
         input.nextLine();
         input.nextLine();
         }
      }else {
         System.out.println("");
         System.out.println("You choose not to have a weapon!");
         System.out.println("");
         System.out.println("Press Enter");
         //Damage if no weapon is chosen
         fist.setDamage(10);
         damage = fist.getDamage(damage);
         input.nextLine();
         input.nextLine();
      }
      return damage; //this returns the damage based on the weapon you chose        
   }//answer 1, sword if statement
   
   //method for calculating player score
   //playerScore acumulates each battle by however many health you have left after each battle
   public static int score(int health){
      int playerScore = health;
      return playerScore;
   }

   //main method
   //This includes the fighting part, difficulty option, all of the above methods,
   //stat output, and the print writer
   
   public static void main(String[] args) throws IOException {
   
      // Create scanner class called input
      Scanner input = new Scanner(System.in);
      //Create random class
      Random rand = new Random();
      
      //Enemy Variables and Array of different enemies
      String[] enemies = {"Wolf", "Bandit", "Troll", "Goblin", "Bear"};
      int maxEnemyHealth = 0;
      int maxEnemyDamage = 0;
      
      //Player variables
      int numApples = 5;
      String name = greeting();
      int health = 100;
      int attackDamage = weaponFind();
      String weaponName = "";
      if (attackDamage == 40){
         weaponName = "Sword";
      }
      if (attackDamage == 30){
         weaponName = "Axe";
      }
      if (attackDamage == 20){
         weaponName = "Club";
      }
      if (attackDamage == 10) {
         weaponName = "Fists";
      }
      
      //This is the cave method
      cave();
      
      //Hobo method: Will ask if you want an apple, if you say yes and give an apple then he will give you more score
      int score;
      int response = hobo();
      if (response == 50){
         score = 50;
         numApples--;
      }
      else{
         score = 0;
      }
      
      //This is a variable that will control how many loops the fighting part will go through
      //It will be assigned a value when the hobo asks for the difficulty level
      int numberOfFights = 0;
      
      //Hobo will now prompt you for your difficulty
      System.out.println("----------------------------------------------");
      System.out.println("");
      System.out.println("Hobo: I see you are going into that cave...");
      System.out.println("      How good of a fighter are you?");
      System.out.println("");
      System.out.println("1: I am terrible and don't want to die");
      System.out.println("2: Not very good");
      System.out.println("3: Decent");
      System.out.println("4: I am amazing");
      int diffAnswer = input.nextInt();
      String difficulty = "";
      switch (diffAnswer){
         case 1: 
            System.out.println("Hobo: Aww you will probably do great in there!");
            System.out.println("");
            System.out.println("** You go into the cave **");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            difficulty = "Very Easy";
            numberOfFights = 4;
            maxEnemyDamage = 15;
            maxEnemyHealth = 40;
            break;
         case 2: 
            System.out.println("Hobo: Aww well good luck in there");
            System.out.println("");
            System.out.println("** You go into the cave **");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            difficulty = "Easy";
            numberOfFights = 5;
            maxEnemyDamage = 25;
            maxEnemyHealth = 40;
            break;
         case 3: 
            System.out.println("Hobo: Oh well I am sure you will do fine!");
            System.out.println("");
            System.out.println("** You go into the cave **");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            difficulty = "Medium";
            numberOfFights = 6;
            maxEnemyDamage = 30;
            maxEnemyHealth = 60;
            break;
         case 4: 
            System.out.println("Hobo: Well don't be too cocky!");
            System.out.println("");
            System.out.println("** You go into the cave **");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
            input.nextLine();
            difficulty = "Hard";
            numberOfFights = 7;
            maxEnemyDamage = 40;
            maxEnemyHealth = 70;
            break;
      }
      
      //Other player variables
      int appleHealAmount = 40; //Apple heal amount
      int appleDropChance = 50; //Percentage
      int runAwayChance = 3;
      int playerScore = score;
      int fightNum = 0;
      int applesUsed = 0; 
      boolean running = true;
      int answer;
      
      /*
      This is the fighting part of the game which will loop.
      After each battle is completed, it will increment fightNum by 1.
      Once the conditional is no longer true, you will find the exit for the cave.
      */
      Fighting:
      while(fightNum < numberOfFights) {
         System.out.println("---------------------------------------------------");
         
         int enemyHealth = rand.nextInt(maxEnemyHealth);
         enemyHealth += 20;
         String enemy = enemies[rand.nextInt(enemies.length)];
         System.out.println("** " + enemy + " has appeared!" + "**");
         System.out.println("");
         
         Fighting2:
         while(enemyHealth > 0){
            System.out.println("Health: " + health + "      " + "Weapon: " + weaponName);
            System.out.println("Apples: " + numApples + "      " + "Score: " + playerScore);
            System.out.println("");
            System.out.println(enemy + "'s Health: " + enemyHealth);
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1: Attack");
            System.out.println("2: Eat Apple");
            System.out.println("3: Run Away");
            
            answer = input.nextInt();
            if(answer == 1){
               int playerDamage = rand.nextInt(attackDamage);
               playerDamage += 5;
               int enemyDamage = rand.nextInt(maxEnemyDamage);
               enemyDamage += 5;
               
               enemyHealth -= playerDamage;
               health -= enemyDamage;
               
               System.out.println("> " + name + " attacks the " + enemy + " and do " + playerDamage + " damage");
               System.out.println("");
               System.out.println("> " + enemy + " attacks " + name + " and does " + enemyDamage + " damage");
               System.out.println("");
               System.out.println("Press Enter");
               input.nextLine();
               System.out.println("---------------------------------------------------");
               input.nextLine();
               
               if (health < 1) {
                  break;
               }
            }   
            else if(answer == 2){
               if(numApples > 0){
                  health += appleHealAmount;
                  numApples--;
                  applesUsed++;
                  System.out.println("> You eat an apple and gain " + appleHealAmount + " health");//
                  System.out.println("");
                  System.out.println("> You now have " + health + " health");
                  System.out.println("");
                  System.out.println("Press Enter");
                  input.nextLine();
                  System.out.println("---------------------------------------------------");
                  input.nextLine();
               }
               else {
                  System.out.println("> You have no more apples left!!! :(");
               }
            }
            else if(answer == 3){
               System.out.println("");
               System.out.println(" > You run away safely from the " + enemy);
               System.out.println("   and continue through the cave");
               System.out.println("");
               System.out.println("Press Enter");
               input.nextLine();
               input.nextLine();
               continue Fighting;
            }
            else{
               System.out.println("Not one of the options! Pick again!");
               System.out.println("");
               System.out.println("---------------------------------------------------");
            }
         }//first while loop
         
         if(health < 1) {
            System.out.println("You have died!! You lose!!!");
            break;
         }
                  
         System.out.println("");
         System.out.println("** " + enemy + " was defeated!" + " **");
         System.out.println("You have " + health + " health left ");
         System.out.println("");
         System.out.println("Press Enter");
         fightNum++;
         playerScore += score(health);
         input.nextLine();
         if(rand.nextInt(100) < appleDropChance) {
            numApples++;
            System.out.println("");
            System.out.println("> The " + enemy + " dropped an apple and you pick it up!");
            System.out.println("");
            System.out.println("Press Enter");
            input.nextLine();
         }   
      }//while running
      
      if (health <= 0){
         System.out.println("");
         System.out.println("Better luck next time " + name + "!");
         System.out.println("");
         System.out.println("###################");
         System.out.println("If you are a teacher or TA grading this project,");
         System.out.println("and you died, play again as you will not see the");
         System.out.println("rest of the game.");
         System.out.println("");
         System.out.println("Tips: ");
         System.out.println("> When asked 'How good of a fighter are you?' pick the first");
         System.out.println("  option: 'I am terrible and do not want to die'");
         System.out.println("");
         System.out.println("> Keep an eye on your health and eat apples if you are low on health!");
         System.out.println("");
         System.out.println("###################");
      }
      else{
         //executes if you did not die in the battles
         playerScore += health;
      
         System.out.println("---------------------------------------------------------");   
         System.out.println("You see an exit for the cave!");
         System.out.println("");
         System.out.println("You walk out of the cave");
         System.out.println("");
         System.out.println("Press Enter");
         input.nextLine();
         
         System.out.println("----------------------------------------------------------");
         System.out.println("You see your house in the distance!!! You made it!!");
         System.out.println("Congrats, you have won!!!");
         System.out.println("");
         System.out.println("Thanks for playing " + name + "!");
         System.out.println("");
         System.out.println("Press Enter");
         System.out.println("----------------------------------------------------------");
         input.nextLine();
         System.out.println("");
         System.out.println("Would you would like to see your final stats?");
         System.out.println("A file containing your stats will be created in");
         System.out.println("your computer regardless called: TheForest.txt");
         System.out.println("");
         System.out.println("1: Show stats");
         System.out.println("2: No thanks");
         answer = input.nextInt();
         if(answer == 1){
            System.out.println("");
            System.out.println("----------------------------------------------------------");
            System.out.println("Name: " + name);
            System.out.println("");
            System.out.println("Difficulty: " + difficulty);
            System.out.println("Final score: " + playerScore);
            System.out.println("Weapon used: " + weaponName);
            System.out.println("Amount of Apples Eaten: " + applesUsed);
            System.out.println("");
         }
         else {
            System.out.println("");
            System.out.println("Thanks for playing!");
         }
         
         //Printwriter and file class to print to a document called the forest
         //Keeps track of each game that you play, labeled with whatever name you put in
         String filename = "TheForest.txt";
         FileWriter fwriter = new FileWriter(filename, true);
         PrintWriter outputFile = new PrintWriter(fwriter);
         
         outputFile.println("Thank you for playing!!!");
         outputFile.println("");
         outputFile.println("Stats for: " + name);
         outputFile.println("");
         outputFile.println("Difficulty: " + difficulty);//
         outputFile.println("Final score: " + playerScore);
         outputFile.println("Weapon used: " + weaponName);
         outputFile.println("Amount of Apples Eaten: " + applesUsed);
         outputFile.println("");
         outputFile.println("---------------------------------------------------");
         outputFile.println("");
         outputFile.close();
         
         
      }
      new theEnd(); //Displays end game screen
   }//main

}//public class