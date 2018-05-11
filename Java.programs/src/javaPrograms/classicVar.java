package javaPrograms;
import java.io.*;
public class classicVar
{
	public static double salary;
	public static final String dept="development";

	public static void main(String args[])
	{
		salary =10000;
		System.out.println(dept+ "Classic variable with static"+salary);
	}
}