package com.company;

import java.util.Random;

public class Generator {

    Random random = new Random();


    public char[] allOptions(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String ambiguousCharacters = "{}[]()/'`~,;:.<>";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers + ambiguousCharacters;

        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));
        password[4] = ambiguousCharacters.charAt(random.nextInt(ambiguousCharacters.length()));

        for(int i = 5; i < length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
    public String onlyNumbers(int length) {
        int[] intpassword = new int[length];

        for(int i = 0; i < length ; i++) {
            intpassword[i] = random.ints(0, 9)
                    .findFirst()
                    .getAsInt();
          //  System.out.println(intpassword[i]);
        }

        String password = "";
        for(int i = 0; i < length ; i++) {
            password = password +  + intpassword[i];
        }
        return password;
    }
    public char[] onlyCharacters(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String combinedChars = capitalCaseLetters + lowerCaseLetters;
        char[] password = new char[length];


        for(int i = 0; i < length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
    public char[] onlyUpperCase(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++) {
            password[i] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        }
        return password;
    }
    public char[] onlyLowerCase(int length) {
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++) {
            password[i] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        }
        return password;
    }
    public char[] onlySymbols(int length) {
        String symbols = "!@#$₸%=";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++) {
            password[i] = symbols.charAt(random.nextInt(symbols.length()));
        }
        return password;
    }
    public char[] onlyAmbiguous(int length) {
        String ambiguousCharacters = "{}[]()/'`~,;:.<>";
        char[] password = new char[length];
        for(int i = 0; i < length ; i++) {
            password[i] = ambiguousCharacters.charAt(random.nextInt(ambiguousCharacters.length()));
        }
        return password;
    }
    public char[] withoutChars(int length) {
        String specialCharacters = "!@#$";
        String ambiguousCharacters = "{}[]()/'`~,;:.<>";
        String numbers = "1234567890";
        String combinedChars = specialCharacters + numbers + ambiguousCharacters;

        char[] password = new char[length];

        password[0] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[1] = numbers.charAt(random.nextInt(numbers.length()));
        password[2] = ambiguousCharacters.charAt(random.nextInt(ambiguousCharacters.length()));

        for(int i = 3; i < length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }



}
