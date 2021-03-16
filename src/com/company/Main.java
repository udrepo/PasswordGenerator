package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Generator pg = new Generator();
        Scanner input = new Scanner(System.in);
boolean done = false;
do{
        System.out.println("-----------------------------------\n" +
                "Welcome to Password Generator v0.1\n" +
                "-----------------------------------\n" +
                "Choose options to generate password\n" +
                "1. With Upper and Lower case, Symbols, Numbers and Ambiguous chars\n" +
                "2. Only numbers\n" +
                "3. Only characters\n" +
                "4. Only symbols and Ambiguous chars\n" +
                "5. Without characters\n" +
                "Enter number: ");
        int choose = input.nextInt();
        System.out.println("Now enter password length you want to create:");
        int il = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Your new password: " + new String(pg.allOptions(il)));
                break;
            case 2:
                System.out.println("Your new password: " +pg.onlyNumbers(il));
                break;
            case 3:
                System.out.println("Your new password: " +pg.onlyCharacters(il));
                break;
            case 4:
                System.out.println("Your new password: " +pg.onlySymbols(il));
                break;
            case 5:
                System.out.println("Your new password: " +pg.withoutChars(il));
                break;

        }

    System.out.println(
            "Wanna generate one more password?\n" +
                    "1. Yes\n" +
                    "2. No"
    );
    int more = input.nextInt();
    if (more == 2)
        done = true;
    }while (!done);
        System.out.println("Good bye!");
    }
    }

