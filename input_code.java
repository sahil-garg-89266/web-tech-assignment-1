1.

package com.company;
import java.util.*;


public class Main{
    public static int addition(int first,int second){
        return first+second;
    }
    public static int subtraction(int first,int second){
        return first-second;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        int add = addition(first,second);
        System.out.println("Addition of two number is : " + add);
        int sub = subtraction(first,second);
        System.out.println("Subtraction of two number is : "+ sub);
    }
}

2.

package com.company;
import java.util.*;


public class Main {


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float first = sc.nextFloat();
        System.out.println("Enter Second number: ");
        float second = sc.nextFloat();

        float product = first*second;

        System.out.println("The product is: " + product);
    }

}


3.


package com.company;
import java.util.*;


public class Main {


    public static void main(String[] args) throws Exception {
        // your code goes here
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second number: ");
        int second = sc.nextInt();

        int quotient = first/second;
        int remainder = first%second;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);

    }
   

}


4.

package com.company;
import java.util.*;


public class Main {
    public static void Swap_using_temp(int first,int second){
        int temp = first;
        first = second;
        second = temp;
        System.out.println("The First number is: " + first);
        System.out.println("The Second number is: " + second);
    }
    public static void Swap_without_using_temp(int first,int second){
        first = first+second;
        second = first-second;
        first = first-second;
        System.out.println("The First number is: " + first);
        System.out.println("The Second number is: " + second);
    }

    public static void main(String[] args) throws Exception {
        // your code goes here

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter Second number: ");
        int second = sc.nextInt();

        System.out.println("Enter 0 to swap using Temporary variable and 1 without Temporary variable: ");
        

        int input = sc.nextInt();
        if(input==0){
            Swap_using_temp(first, second);
        }else{
            Swap_without_using_temp(first, second);
        }
        

    }


}


