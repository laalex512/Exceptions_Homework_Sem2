package Homework2;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
	public static void enterFloat(){
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter float:");
			String input = scanner.next();
			if (isFloat(input)) {
				System.out.println(input);
				break;
			} else {
				System.out.println("This is not float!");
			}
		}
	}


	public static boolean isFloat(String num){
		int dotCounter = 0;
		char[] arrayInput = num.toCharArray();
		int beginCycle = 0;
		if (arrayInput[0] == '-'){
			beginCycle++;
		}
		for (int i = beginCycle; i < arrayInput.length; i++){
			if (arrayInput[i] == '.'){
				dotCounter++;
				if (dotCounter > 1){
					return false;
				}
				continue;
			}
			if (!Character.isDigit(arrayInput[i])){
				return false;
			}
		}
		return true;
	}
}
