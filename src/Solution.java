import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       while(true){
           char op = scanner.next().trim().charAt(0);
           if(op=='+'|| op =='*'||op=='-'||op=='/'||op=='%'){
               int num1 = scanner.nextInt();
               int num2 = scanner.nextInt();

               if(op=='+'){
                   System.out.println(num1+num2);
               } else if (op=='-') {
                   System.out.println(num1-num2);
               } else if (op=='*') {
                   System.out.println(num1*num2);
               } else if (op=='/') {
                   System.out.println(num1/num2);
               } else if (op=='%') {
                   System.out.println(num1%num2);
               } else if (op=='x'||op=='X') {
                   break;
               } else {
                   System.out.println("Enter valid one");
               }
           }
       }
    }

}



