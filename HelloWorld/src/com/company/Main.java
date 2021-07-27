package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String username;
        username = "Troy";


	System.out.println("Hello " + username);

	username = "Tom";
	System.out.println("Hello " + username);

	System.out.println("What is your name");
	username = input.nextLine();
	System.out.println("Hello " + username);

	System.out.println("How many days have you been at Tafe?");

	int days = Integer.parseInt(input.nextLine());
	System.out.println("How is day " + days + "going?");
    }
}
