package oop;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import bai11.Circle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VCC
 */
public class TestCircle {
    	public static void main(String[] args) throws IOException {
		
		// tạo 1 Circle c1, set radius bằng constuctor
		Circle c1 = new Circle(5);
		
		/*BufferedReader */
		Circle c2 = new Circle();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(bufferedReader.readLine());
		c2.setRadius(r);
		
		// Scanner
		Circle	c3 = new Circle();
		Scanner sc = new Scanner(System.in);
		r = Integer.valueOf(sc.next());
		c3.setRadius(r);
		
		System.out.println("Hinh tron 1: r = " + c1.getRadius() +" Area = " + c1.getArea() + " Circum = " + c1.getCircum());
		System.out.println("Hinh tron 2: r = " + c2.getRadius() +" Area = " + c2.getArea() + " Circum = " + c2.getCircum());
		System.out.println("Hinh tron 3: r = " + c3.getRadius() +" Area = " + c3.getArea() + " Circum = " + c3.getCircum());
	}
}
	