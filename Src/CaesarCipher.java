package Src;

import java.util.Scanner;

//A Java Program to illustrate Caesar Cipher Technique
class CaesarCipher
{
    public static StringBuffer encrypt(String nameString, int s) {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<nameString.length(); i++){
            if (Character.isUpperCase(nameString.charAt(i))) {
                char ch = (char)(((int)nameString.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)nameString.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name ");
        String text = sc.nextLine();
        int s = 4;
        System.out.println("Name_String : " + text);
        System.out.println("CaesarCipher_algo...->  " + encrypt(text, s));
        System.out.println("For visualization https://media.geeksforgeeks.org/wp-content/uploads/ceaserCipher.png");
    }
}

