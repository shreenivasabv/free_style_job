import java.util.*;
public class calculator{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a");
	int a = sc.nextInt();
	System.out.println("enter b");
	int b=sc.nextInt();
	System.out.println("enter a choice 1.add 2.sub 3.mul 4.div");
	int choice = sc.nextInt();
	if(choice==1){
		System.out.println(a+b);
	}
	if(choice==2){
		System.out.println(a-b);
	}
	if(choice==3){
		System.out.println(a*b);
	}
	if(choice==4){
		System.out.println(a/b);
}
}
}