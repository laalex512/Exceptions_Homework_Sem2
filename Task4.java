package Homework2;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {

	public static void dontEmpty() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Don't enter empty string!!!");
		String input = scanner.nextLine();
		if (input.isEmpty()){
			throw new RuntimeException("Don't enter empty string!!! Bye");
		} else{
			System.out.println("thanks!");
		}
	}
}
