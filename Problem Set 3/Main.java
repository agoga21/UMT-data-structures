import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    rockPaperScissors();

    }
    public static void rockPaperScissors(){


        try {
            int[] nrs = {1,2,3};
            System.out.println("Enter 1-Rock, 2-Paper or 3-Scissors");
            boolean flag1 = true;
            while (flag1) {

                int botPoints = 0;
                int playerPoints = 0;
                int rounds = 0;
                while (rounds != 5) {
                    Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();
                    int random = new Random().nextInt(nrs.length);
                    boolean flag = true;

                    while (flag) {
                        if (choice > 3 || choice < 1) {
                            System.out.println("Please enter a valid number!");
                            choice = scanner.nextInt();
                        } else {
                            flag = false;
                        }
                    }


                    if (choice == 1 && nrs[random] == 2) {
                        System.out.println("Bot --> Paper");
                        botPoints++;
                        rounds++;
                    }
                    if (choice == 2 && nrs[random] == 1) {
                        System.out.println("Bot --> Rock");
                        playerPoints++;
                        rounds++;
                    }
                    if (choice == 1 && nrs[random] == 1) {
                        System.out.println("Bot --> Rock");
                        playerPoints++;
                        botPoints++;
                        rounds++;
                    }
                    if (choice == 1 && nrs[random] == 3) {
                        System.out.println("Bot --> Scissors");
                        playerPoints++;
                        rounds++;
                    }
                    if (choice == 2 && nrs[random] == 2) {
                        System.out.println("Bot --> Paper");
                        playerPoints++;
                        botPoints++;
                        rounds++;
                    }
                    if (choice == 2 && nrs[random] == 3) {
                        System.out.println("Bot --> Scissors");
                        botPoints++;
                        rounds++;
                    }
                    if (choice == 3 && nrs[random] == 1) {
                        System.out.println("Bot --> Rock");
                        botPoints++;
                        rounds++;
                    }
                    if (choice == 3 && nrs[random] == 2) {
                        System.out.println("Bot --> Paper");
                        playerPoints++;
                        rounds++;
                    }
                    if (choice == 3 && nrs[random] == 3) {
                        System.out.println("Bot --> Scissors");
                        playerPoints++;
                        botPoints++;
                        rounds++;
                    }


                    System.out.println("Player points : " + playerPoints + "\nBot points : " + botPoints);
                }

                if (playerPoints > botPoints) {
                    System.out.println("You won!");
                }
                if (playerPoints < botPoints) {
                    System.out.println("You lost!");
                } else {
                    System.out.println("Its a draw!");
                }

                System.out.println("Do you want to play again?\n1-->Yes\n2-->No");
                Scanner sc = new Scanner(System.in);
                int end = sc.nextInt();
                if (end == 2) {
                    flag1 = false;
                }
                System.out.println("Enter 1-Rock, 2-Paper or 3-Scissors");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Please enter a valid input!");
        }
        finally {
            System.out.println("Thank you for playing!");
        }
    }
}