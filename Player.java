package prac06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	 static void powerXY(int x,int y)throws CalException{ 
	 	if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義!");
		}else if(y<0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		}
		double i=Math.pow(x,y);	
		System.out.println(x+"的"+y+"次方等於"+i);
		
	}
	public static void main (String[]args)throws Exception{
		try {
		System.out.println("請輸入x的值:");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		System.out.println("請輸入y的值:");
		int y=scan.nextInt();
		powerXY(x,y);
		}catch(InputMismatchException e){
			System.out.println("格式不正確");
		}catch(CalException e) {
			e.printStackTrace();
		}
		
	}
}
