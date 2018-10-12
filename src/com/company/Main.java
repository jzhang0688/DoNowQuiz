package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a number");
        int num = input.nextInt();
            int sum = 0;
            int i = num;
            while (i > 0)
            {
                sum = sum + i;
                i--;
            }
            System.out.println("The sum from 1 to " + num + " is " + sum);
        }
    }
