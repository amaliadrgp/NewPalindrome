package ro.fastrackit.classroom;

import java.util.Scanner;

class PalindromeExample{

    public static void main(String[] args){

        String original = "";
        String reverse = "";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number to check if it's a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i=length - 1; i>=0;i-- )
            reverse = reverse+original.charAt(i);
        if(original.equals(reverse))
            System.out.println("Is a palindrome");
        else
            System.out.println("Is not a palindrome");
    }
}