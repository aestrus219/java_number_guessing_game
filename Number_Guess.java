import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Number_Guess {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Choose difficulty:\n[1] Easy\n[2] Medium\n[3] Hard");
        int diff = x.nextInt();
        int n;
        boolean win = false;
        switch (diff) {
            case 1:
                n = ThreadLocalRandom.current().nextInt(1, 11);
                System.out.println("How to play:\nYour objective is to guess a random number between the range of 1-10. You get three chances and each chance the computer will hint you by responding if the number entered is lesser or higher than the actual number. GOOD LUCK!");
                System.out.println("Are you ready?\n[1] Yes\n[2] No");
                int entry = x.nextInt();
                switch(entry) {
                    case 1:

                        for (int i=1; i<=3; i++) {
                            if (win==false) {
                                System.out.println("Enter your guess");
                                int guess = x.nextInt();
                                if(guess>n) {
                                    System.out.println("Too High");
                                } else if (guess<n) {
                                    System.out.println("Too Low");
                                } else {
                                    System.out.println("YOU WIN!");
                                    win = true;    
                                }
                            }
                        }
                        if(win==false) {
                            System.out.println("YOU LOST!");
                        }
                        break;
                    case 2:
                        System.out.println("Game Aborted");
                        break;

                }

                break;

            case 2:
                n = ThreadLocalRandom.current().nextInt(1, 21);
                System.out.println("How to play:\nYour objective is to guess a random number between the range of 1-20. You get five chances and each chance the computer will hint you by responding if the number entered is lesser or higher than the actual number. GOOD LUCK!");
                System.out.println("Are you ready?\n[1] Yes\n[2] No");
                int entry2 = x.nextInt();
                switch(entry2) {
                    case 1:

                        for (int i=1; i<=5; i++) {
                            if (win==false) {
                                System.out.println("Enter your guess");
                                int guess = x.nextInt();
                                if(guess>n) {
                                    System.out.println("Too High");
                                } else if (guess<n) {
                                    System.out.println("Too Low");
                                } else {
                                    System.out.println("YOU WIN!");
                                    win = true;    
                                }
                            }
                        }
                        if(win==false) {
                            System.out.println("YOU LOST!");
                        }
                        break;
                    case 2:
                        System.out.println("Game Aborted");
                        break;

                }
                break;
            case 3:
                n = ThreadLocalRandom.current().nextInt(1, 51);
                System.out.println("How to play:\nYour objective is to guess a random number between the range of 1-50. You get ten chances and each chance the computer will hint you by responding if the number entered is lesser or higher than the actual number. GOOD LUCK!");
                System.out.println("Are you ready?\n[1] Yes\n[2] No");
                int entry3 = x.nextInt();
                switch(entry3) {
                    case 1:

                        for (int i=1; i<=10; i++) {
                            if(win==false) {
                                System.out.println("Enter your guess");
                                int guess = x.nextInt();
                                if(guess>n) {
                                    System.out.println("Too High");
                                } else if (guess<n) {
                                    System.out.println("Too Low");
                                } else {
                                    System.out.println("YOU WIN!");
                                    win = true;    
                                }
                            }
                        }
                        if(win==false) {
                            System.out.println("YOU LOST!");
                        }
                        break;
                    case 2:
                        System.out.println("Game Aborted");
                        break;
                }

                break;
        }

    }

}

