package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int length = 10; // pass length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Password");
        String charCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars =  "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*()_+~<>?>.-=";
        String passSymbols = charCaps + chars + nums + symbols;
        Random rnd = new Random();
         char[] password = new char[len];
         int index = 0;
         for (int i = 0; i< len; i++)
         {
             password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
         }
         return password;
    }
}
