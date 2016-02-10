import java.util.Scanner;
public class ArrayExamples {
	public boolean isValid(String n){
		try{
			int numberfortable = Integer.parseInt(n);
			return true;
		}
		catch(Exception e){
			System.out.println("Please enter in an integer. This value:"+n+" is not an integer");
			return false;
		}
		}
	public boolean isValid1(String n){
		//commit1 //commit2 //commit 3
		try{
			int numberOfMultiplications = Integer.parseInt(n);
			return true;
		}
		catch(Exception e){
			System.out.println("Please enter in an integer.This value" +n +"is not an integer");
			return false;
		}
		}

	public static void main (String[] args)
	{
		ArrayExamples array1 = new ArrayExamples();
		System.out.print("Please enter which number you would like to make a multiplication chart of:");
		Scanner input = new Scanner(System.in);
		String n = input.next();
		while(!array1.isValid(n)){
			System.out.println("Please enter the correct value:which number you would like to make a multiplication chart of:");
			n = input.next();
		}
		int numberfortable = Integer.parseInt(n);
		System.out.print("Please enter how many times you would like a product:");
		String i = input.next();
		while(!array1.isValid1(i)){
			System.out.println("Please enter the correct value:how many times you would like a product:");
			i = input.next();
		}
		int numberOfMultiplications = Integer.parseInt(i);
		String[] array = new String[numberOfMultiplications];
		for(int counter = 0; counter < array.length; counter++){
			if(counter == 0){
				int b = counter*numberfortable + numberfortable;
				array[counter] = Integer.toString(counter+1)+"X"+Integer.toString(numberfortable)+"="+Integer.toString(b);
			}
			else{
				
				int b = (counter+1)*numberfortable;
				array[counter] = Integer.toString(counter+1)+"X"+Integer.toString(numberfortable)+"="+Integer.toString(b);
			}
			
				
				System.out.println(array[counter]);
			}
			
			
		
		
	}
}
