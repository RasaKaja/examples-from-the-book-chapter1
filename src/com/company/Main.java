package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        //main.BeerSong();
        //main.PhraseOMatic();
        //main.shuffle1();
        //main.Test();
        main.PoolPuzzleOne();

    }

    void BeerSong() {

        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

//            if (beerNum > 0) {
//                System.out.println(beerNum + " " + word + " of beer on the wall");
//            } else {
//                System.out.println("No more bottles of beer on the wall");
        }
        System.out.println("No more bottles of beer on the wall");
    }

    void PhraseOMatic(){
        // Make three sets of words to choose from:
        String[] wordListOne = {"24/7", "multi-Tier", "30.000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveradeg", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        // Find out how many words are in each list:
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Generate three random numbers:
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Now build a phrase:
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Print out the phrase:
        System.out.println("What we need is a " + phrase);
    }

    void shuffle1(){
        // From the Chapter 1, p.20 (54)

        int x = 3;

        while (x > 0) {
            if (x > 2) { // 3 > 0
                System.out.print("a"); // "a"
            }

            if (x == 2) { // x =2
                System.out.print("b c"); //"a-b c"
            }

            x = x -1; // x = 3-1 -2 | x = 2-1 =1
            System.out.print("-"); // "a-" | "a-b c-"

            if (x == 1) { // x=1
                System.out.print("d"); //"a-b c-d"
                x = x - 1;
            }
        }
    }

    void Test(){
        // Chapter 1, p. 23 (57)

        int x = 0;
        int y = 0;

        System.out.println("When the condition inside while is 'y = x - y', output is: ");
        while (x < 5) {
            y = x - y;
            System.out.print(x+ "" + y + " ");
            x = x + 1;
        }

        System.out.println("When the condition inside while is 'y = x + y', output is: ");
        int x1 = 0;
        int y1 = 0;
        while (x1 < 5) {
            y1 = y1 + x1;
            System.out.print(x1+ "" + y1 + " ");
            x1 = x1 + 1;
        }

        System.out.println("When the condition inside while is 'y = y + 2 | if (y > 4) { y = y-1 }', output is: ");
        int x2 = 0;
        int y2 = 0;
        while (x2 < 5) {
            y2 = y2 + 2;
            if (y2 > 4) {
                y2 = y2 - 1;
            }
            System.out.print(x2+ "" + y2 + " ");
            x2 = x2 + 1;
        }

        System.out.println("When the condition inside while is 'y = y + x, x = x + 1, output is: ");
        int x3 = 0;
        int y3 = 0;
        while (x3 < 5) {
            y3 = y3 + x3;
            x3 = x3 + 1;
            System.out.print(x3+ "" + y3 + " ");
            x3 = x3 + 1;
        }

        System.out.println("When the condition inside while is 'y = y + x, x = x + 1, output is: ");
        int x4 = 0;
        int y4 = 0;
        while (x4 < 5) {
            if (y4 < 5) {
                x4 = x4 + 1;
                if (y4 < 3) {
                    x4 = x4 - 1;
                }
            }
            y4 = y4 + 2;
            System.out.print(x4+ "" + y4 + " ");
            x4 = x4 + 1;
        }
    }

    void PoolPuzzleOne(){
        int x = 0;
        while (x < 4) {
          System.out.print("a");

            if (x < 1){
                System.out.print(" ");
            }

          System.out.print("n");

            if (x < 1) {
                System.out.print("oise");
                x = x-1;
            }

            if (x == 1){
                System.out.print("noys");
            }

            if (x > 1){
                System.out.print(" oyster");
            }

          System.out.println("");
          x = x+2;
        }
    }

}

