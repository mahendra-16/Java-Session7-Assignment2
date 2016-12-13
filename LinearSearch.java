package Session7;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10, 7, 1, 3, -4, 2, 20};
		int i, num, index = 0;
		
		for(int display : array){
			System.out.println(display);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		for(i = 0; i < array.length; i++){
			if(array[i] == num){
				index = i;
				break;
				//System.out.println("Item found...");
			}
		}
		
		if(index == i){
			System.out.println("Item found..");
		}else{
			System.out.println("Item Not Found...");
		}
		
		
		
	}

}
