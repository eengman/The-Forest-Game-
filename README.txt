File	: README.txt
Author  : Eric Engman
Project : CS110 Final Project
Date    : 5/30/18
====================================

Program Description: 
====================================

This program is a text-adventure dungeon crawler. It includes multiple choices throughout 
the game which will effect how it plays. For example, the difficulty setting you choose will affect
how much damage you will do and how much the enemy will do. Another example is when you choose your
weapon. Depending on your weapon choice, your damage will be different. This program has many lines of
code (about 550), which is necessary when you have a text-adventure game, as there are a lot of 
System.out.println lines. This program makes use of all the elements that we have learned throughout 
the quarter. There are multiple variables that will be tracked as you play through the game, such as
player score, health, weapon, apples (eat to increase health), and so on. Things like player damage, 
enemy damage, and chance that an enemy drops an apple are all randomly generated within a range. The range
depends on the difficulty level that you choose. If you sucessfully finish the game, your stats that were 
being tracked as you played will display in the console. A document will also be generated which is
named TheForest.txt. This text document displays the same stats as the console, however, it will save
the stats for each iteration of the game so that you may try to beat your previous score. Additionally,
a seperate window will pop up saying "The End :)", which was created using JFrame elements. This is done
by invoking a constructor inside of the "theEnd.java" class. 

Files 
====================================
IMPORTANT: You MUST open all of the files in order for the main program (TheForestFinalProject) to compile and run!!

This program requires 5 files to run properly:
1: TheForestFinalProject.java (Driver class where game is ran)
2: Sword.java
3: Axe.java
4: Club.java
5: noWeapon.java
6: theEnd.java

These files will be included in the zip file where you found this README text document.

How to play:
====================================

At the beginning of the game, you will be prompted with a greeting method which will ask you to input your name.
Any questions that the game prompts you with require you to input an integer from the choices presented.
When the hobo asks you "How good of a fighter are you", your choice will set the difficulty, such as enemy damage,
your damage, and how many times the fight loop will iterate. Option 1 is the easiest and 4 is the hardest. 
When you reach the battle sequence of the game, you will be presented with several options. The choices are given 
self explanatory on what will happen. If your health gets low, eat apples (if you have any left) to restore health.
When you finish the game, a file named "TheForest.txt" will be created to see how you did. I hope you enjoy the game!


Additional Comments & Info:
====================================

This game was originally supposed to play inside of a JFrame window, using Action listeners, buttons, text fields, 
and so on. However, it became overwhelming and was not able to compile so I chose to settle for a it to run
in the console window. The java class "theEnd" is my only successful attempt at using JFrames that actually compiled
and ran as intended. 

