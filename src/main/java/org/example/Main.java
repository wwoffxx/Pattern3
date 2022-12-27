package org.example;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text... \n");
            String Text = sc.next();
            char[] sarray = Text.toCharArray();
            if (checkPalindrome(sarray)) {
                Text palindrom = new Palindrome(Text);
                System.out.println("Enter number:\n1 - see true text\n2 - see mirrored text\n or 3 to exit\n");
                int choose = 0;

                while(choose != 3) {
                    choose = sc.nextInt();
                    switch (choose) {
                        case 1:
                            Text trueObj = new True(palindrom);
                            System.out.println("In Real World:\n" + trueObj.getText());
                            break;
                        case 2:
                            Text mirrored = new Mirrored(palindrom);
                            System.out.println("In Mirror World:\n" + mirrored.getText());
                            break;
                        default:
                            System.out.println("Your string is: " + Text);
                    }
                }

                System.out.println("Exit..");
            }

        }

        public static boolean checkPalindrome(char[] sp) {
            boolean palindrome = false;
            int i;
            if (sp.length % 2 == 0) {
                for(i = 0; i < sp.length / 2 - 1; ++i) {
                    if (sp[i] != sp[sp.length - i - 1]) {
                        System.out.println("Sorry, it is not palindrome");
                        return false;
                    }

                    System.out.println("It is palindrome!");
                    palindrome = true;
                }
            } else {
                for(i = 0; i < (sp.length - 1) / 2 - 1; ++i) {
                    if (sp[i] != sp[sp.length - i - 1]) {
                        System.out.println("Sorry, it is not palindrome");
                        return false;
                    }

                    System.out.println("It is palindrome!");
                    palindrome = true;
                }
            }

            return palindrome;
    }
}