package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Calculator Begins!!");
        //some changes
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        int num, exp;

        do{
            System.out.println("Operation:\n");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Power");
            System.out.println("4. Multiply");
            System.out.println("5. Exit\n");
            System.out.print("Enter your choice(number): \n");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // addition
                        System.out.println("Add two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        add(num,exp);
                        break;

                    case 2: //Subtract
                        System.out.println("Subtract two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        subt(num,exp);
                        break;

                    case 3: //Power
                        System.out.println("Power two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        per(num,exp);
                        break;

                    case 4: //Power
                        System.out.println("Multiply two numbers!!\n");
                        System.out.print("Enter number1: \n");
                        num = reader.nextInt();
                        System.out.print("Enter number2: \n");
                        exp = reader.nextInt();
                        mul(num,exp);
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static int add(int num,int exp){
        int c=num+exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing addition for"+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }

    public static int subt(int num,int exp){
        int c=num-exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing subtraction for"+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static int mul(int num,int exp){
        int c = num*exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing subtraction for"+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
    public static int per(int num, int exp){
        int c = num%exp;
        System.out.println("\nThe Result is "+c+"\n");
        logger.info("Executing subtraction for"+num+" and "+exp+". Result: "+c+"\n");
        return c;
    }
}