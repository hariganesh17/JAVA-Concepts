package ControlFlow;

import java.util.Scanner;

public class CreatingMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do{
                System.out.println("Menu");
                System.out.println("1.Option 1");
                System.out.println("2.Option 2");
                System.out.println("3.Option 3");
                System.out.println("4.Exit");
                System.out.println("Enter your choice: ");

                choice = scanner.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("you entered option 1.");
                        break;
                    case 2:
                        System.out.println("you entered option 2.");
                        break;
                    case 3:
                        System.out.println("you entered option 3.");
                        break;
                    case 4:
                        System.out.println("Existing");
                        break;
                    default:
                        System.out.println("enter valid number");
                        break;
                }
            }while(choice != 4);
            scanner.close();
        }
    }