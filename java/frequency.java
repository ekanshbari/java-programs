// import java.util.Scanner;

// class a
// {
// 	public static void main(String[] args){
// 		Scanner sc=new Scanner(System.in);
// 		String s=sc.nextline();


	
// 	}
// }

// import java.awt.*;
// import java.applet.*;

// public class myapplet extends applet{
// 	public void paint(Graphics g){
// 		g.drawString("A simple applet",20,20);
// 	}
// }

// class bitwise_operator
// {
// 	public static void main(String[] args){
// 		int var1= 42;
// 		int var2=~var1;
// 		System.out.println(var1+" "+var2);
// 	}
// }

import java.io.*;
class Chararrayinput
{
	public static void main(String[] args){
		String obj ="abcdefgh";
		int length=obj.length();
		char c[]=new char[length];
		obj.getChars(0,length,c,0);
		CharArrayReader input1=new CharArrayReader(c);
		CharArrayReader input2=new CharArrayReader(c,1,4);
		int i;
		int j;
		try
		{
			while((i=input1.read())==(j=input2.read())){
				System.out.print((char)i);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}