import java.util.Scanner;
public class Until0{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a series of values(0 to quit): ");
		int num,sum=0;
		while((num=input.nextInt())!=0){
			sum+=num;
		}
		System.out.println(sum);
	}
}