package week6_execises;

import java.util.Scanner;
import java.util.Random;

enum HandSign{
    ROCK,
    PAPER,
    SCISSOR
}

class Gamer{
    
    static int numOfDraw;
    static int numOfTrials;
    int numOfWin;
    String name;
    HandSign sign;

    Gamer(String name){
        this.name = name;
    }

    void move(){
        
        boolean isInputValid = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter q for quit.\n Please enter R for Rock.\n Please enter S for Scissor.\n Please enter P for paper.\n");
        
        do{
            String desicion = scanner.nextLine();

            switch(desicion){
                case "q" :
                    Arena.isGameOver = true;
                    break;
                case "R" :
                    this.sign = HandSign.ROCK;   
                    break;
                case "S" :
                    this.sign = HandSign.SCISSOR;
                    break;
                case "P" :
                    this.sign = HandSign.PAPER;
                    break;
                default :
                    isInputValid = true;
                    break;        
            }
        }while(isInputValid);
    }

    void moveAuto(){
        Random random = new Random();
        int choice = random.nextInt(3); // 0, 1, or 2
        switch (choice){
            case 0:
                this.sign = HandSign.ROCK;
                break;
            case 1:
                this.sign = HandSign.PAPER;
                break;
            case 2:
                this.sign = HandSign.SCISSOR;
                break;
        }
    }
}

class Arena{

    Gamer g1,g2;
    static boolean isGameOver;

    void addGamers(Gamer g1, Gamer g2){
       this.g1 = g1;
        this.g2 = g2;
    }

    void startGame(){

        while(!isGameOver){
            g1.moveAuto();
            g2.move();
            processMove();
            isGameOver = (Gamer.numOfTrials==3);
        }
        displayScores();
    }

    void processMove(){
        if(g1 == null || g2 == null || isGameOver==true) return;
        else if( g1.sign == g2.sign)
            Gamer.numOfDraw++;
        else if(g1.sign == HandSign.ROCK && g2.sign == HandSign.SCISSOR)
            g1.numOfWin++;
        else if(g1.sign == HandSign.PAPER && g2.sign == HandSign.ROCK)
            g1.numOfWin++;   
        else if(g1.sign == HandSign.SCISSOR && g2.sign == HandSign.PAPER)
            g1.numOfWin++;
        else       
            g2.numOfWin++;
        
        Gamer.numOfTrials++;
    }

    void displayScores(){
        System.out.println(g1.name + " won " + g1.numOfWin + " game." );
        System.out.println(g2.name + " won " + g2.numOfWin + " game." );
        System.out.println("Number of draws: " + Gamer.numOfDraw);
        System.out.println("Number of trials: " + Gamer.numOfTrials);
    }

}

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Gamer g1 = new Gamer("PC");
        Gamer g2 = new Gamer("Muge");
        Arena arena = new Arena();

        arena.addGamers(g1, g2);
        arena.startGame();
    }
}
