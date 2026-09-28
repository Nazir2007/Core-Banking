package version01;

import java.util.Scanner;



public class Cbproto {
    public static double vv=10000;
    public static final String ANSI_RED="\u001B[31m";
    public static final String ANSI_GREEN="\u001B[32m";
    public static final String ANSI_DARK_YELLOW="\u001B[33m";
    public static final String ANSİ_RESET="\u001B[0m";
    public static void main(String[] args) {
        System.out.println("Welcome to the bank N ");
        Scanner inp=new Scanner(System.in);
        boolean choice=false;
        while (choice==false) {
            System.out.println(""" 
                    Choose an operation  
                    1- Increase balance 
                    2- Decrease balance 
                    3- Show balance 
                    4- Go home page  """);

            int cho=inp.nextInt();
            switch (cho) {
                case 1:
                    System.out.print(ANSI_GREEN+"Amount + "+"$"+ANSİ_RESET);
                    double incAmount=inp.nextDouble();
                    increase(incAmount);
                    break;
                case 2:
                    System.out.print(ANSI_RED+"Amount - "+"$"+ANSİ_RESET);
                    double decAmount=inp.nextDouble();
                    decrease(decAmount);
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    choice=true;
                default:
                    System.out.println("Please enter a valid number");
           }
        }


    }
    public static void increase(double amount){
        Cbproto.vv+=(amount*0.99);
    }
    public static void decrease(double amount){
        Cbproto.vv-=amount;
    }
    public static void show(){
        System.out.println(ANSI_DARK_YELLOW+"Your current balance is "+Cbproto.vv+"$"+ANSİ_RESET);
    }
}
