package com.bridgelabz.day11problems;

import java.util.Random;

public class DeckOfCards {

    String[] suitArray= {"Clubs", "Diamonds", "Hearts", "Spades"};
    String [] rankArray =  {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][]  cardCombination = new String[4][13];
    String[][] player = new String[4][9];


    public void  getCardCombination() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cardCombination[i][j] = rankArray[j] + suitArray[i];
            }
        }

    }

    public void getPlayerArray(){
        int i;
        int j;
        for( i=0;i<4;i++){
            System.out.println("Players " +(i+1) +"\n");
            for(j=0;j<9;j++){
                Random random = new Random();
                int randomSuit = random.nextInt(4);
                int randomRank = random.nextInt(13);
                player[i][j] = cardCombination[randomSuit][randomRank];
                System.out.print(player[i][j]  +  "   \n");

            }

        }
    }
    public static void main (String[]args){
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getCardCombination();
        deckOfCards.getPlayerArray();

    }

}
