import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        String msg = myGret(name);
        System.out.println(msg);




        }

        static String myGret(String name){
        String message = "hello "+name;
        return message;
        }
    static int sum2(){
        Scanner scanner =   new Scanner(System.in);
        System.out.print("enter num 1: ");
        int num1= scanner.nextInt();
        System.out.println("enter num2: ");
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        return sum;
    }
    static void sum(){
        Scanner scanner =   new Scanner(System.in);
        System.out.print("enter num 1: ");
        int num1= scanner.nextInt();
        System.out.println("enter num2: ");
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        System.out.println("The sum = "+sum);
    }

        }







