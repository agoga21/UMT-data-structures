import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessingGame();
    }
    public static void guessingGame() {
        try {
            boolean flag1 = true;
            while (flag1) {
                System.out.println("Hello! \nBefore you start playing please select the difficulty: ");
                System.out.println("Type 1 --> Easy (The random number is from 1 to 10)");
                System.out.println("Type 2 --> Medium (The random number is from 1 to 100)");
                System.out.println("Type 3 --> Hard (The random number is from 1 to 1000)");
                System.out.println("Notice : in any of the difficulties, the number of guesses is 5");
                Scanner sc = new Scanner(System.in);
                int difficulty = sc.nextInt();
                boolean flag = true;
                while (flag) {

                    if (difficulty > 3 || difficulty < 1) {
                        System.out.println("Please enter a number between 1 and 3!");
                        difficulty = sc.nextInt();
                    } else {
                        flag = false;
                    }

                }


                if (difficulty == 2) { // This is the medium difficulty
                    System.out.println("MEDIUM MODE:");
                    int[] array = {55, 60, 98, 1, 10, 33, 87, 45, 62, 28, 79, 37, 47, 100}; //until 100 max
                    int random = new Random().nextInt(array.length);
                    int guesses = 5;
                    Scanner scanner = new Scanner(System.in);
                    int number;
                    try {
                        System.out.println("The number is between 0 and 100!");
                        while (guesses != 0) {
                            System.out.println("Guess the number: ");
                            number = scanner.nextInt();
                            if (number > array[random]) {
                                System.out.println("The random number is lower than " + number);
                            } else if (number < array[random]) {
                                System.out.println("The random number is higher than " + number);
                            }
                            if (number == array[random]) {
                                System.out.println("Good Job! You found the random number!");
                                guesses = 0;
                            } else {
                                guesses--;
                            }
                            if (guesses == 0 && array[random] != number) {
                                System.out.println("You lost");
                                System.out.println(array[random] + " was the random number!");
                            }
                            if(guesses==0) {
                                System.out.println("Do you want to play again?\n1--> Yes\n2-->No");
                                Scanner scanner1 = new Scanner(System.in);
                                int playAgain = scanner1.nextInt();
                                if (playAgain == 2) {
                                    flag1 = false;
                                }
                            }

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Only numbers should be entered");
                    } finally {


                        System.out.println("Thank you for playing!");
                    }

                } else if (difficulty == 1) { // This is the easy difficulty
                    System.out.println("EASY MODE:");
                    int[] array = {5, 6, 10, 2, 1, 3, 4, 8, 7, 9}; //until 10 max
                    int random = new Random().nextInt(array.length);
                    int guesses = 5;
                    Scanner scanner = new Scanner(System.in);
                    int number;
                    try {
                        System.out.println("The number is between 0 and 10!");
                        while (guesses != 0) {
                            System.out.println("Guess the number: ");
                            number = scanner.nextInt();
                            if (number > array[random]) {
                                System.out.println("The random number is lower than " + number);
                            } else if (number < array[random]) {
                                System.out.println("The random number is higher than " + number);
                            }
                            if (number == array[random]) {
                                System.out.println("Good Job! You found the random number!");
                                guesses = 0;
                            } else {
                                guesses--;
                            }
                            if (guesses == 0 && array[random] != number) {
                                System.out.println("You lost");
                                System.out.println(array[random] + " was the random number!");
                            }
                            if(guesses==0) {
                                System.out.println("Do you want to play again?\n1--> Yes\n2-->No");
                                Scanner scanner1 = new Scanner(System.in);
                                int playAgain = scanner1.nextInt();
                                if (playAgain == 2) {
                                    flag1 = false;
                                }
                            }

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Only numbers should be entered");
                    } finally {


                        System.out.println("Thank you for playing!");
                    }


                } else if (difficulty == 3) { // this is the hard difficulty
                    System.out.println("HARD MODE:");
                    int[] array = {555, 1000, 987, 324, 601, 678, 443, 112, 89, 15, 78, 65, 82, 35, 77,
                            985, 983, 365, 214, 999, 879, 852, 862, 842, 359, 351, 157, 751, 885}; //until 1000 max
                    int random = new Random().nextInt(array.length);
                    int guesses = 5;
                    Scanner scanner = new Scanner(System.in);
                    int number;

                    try {
                        System.out.println("The number is between 0 and 1000!");
                        while (guesses != 0) {
                            System.out.println("Guess the number: ");
                            number = scanner.nextInt();
                            if (number > array[random]) {
                                System.out.println("The random number is lower than " + number);
                            } else if (number < array[random]) {
                                System.out.println("The random number is higher than " + number);
                            }
                            if (number == array[random]) {
                                System.out.println("Good Job! You found the random number!");
                                guesses = 0;
                            } else {
                                guesses--;
                            }
                            if (guesses == 0 && array[random] != number) {
                                System.out.println("You lost");
                                System.out.println(array[random] + " was the random number!");
                            }
                            if(guesses==0) {
                                System.out.println("Do you want to play again?\n1--> Yes\n2-->No");
                                Scanner scanner1 = new Scanner(System.in);
                                int playAgain = scanner1.nextInt();
                                if (playAgain == 2) {
                                    flag1 = false;
                                }
                            }

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Only numbers should be entered");
                    } finally {


                        System.out.println("Thank you for playing!");
                    }

                }

            }
        }
        catch (InputMismatchException l){
                System.out.println("Enter a valid number!");
            }

        }

    }
