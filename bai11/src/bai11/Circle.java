/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Circle
        {
	private int radius ;
	public Circle() {radius = 0;}
	public Circle(int r) {this.radius = r ;}
	public void setRadius(int r) {radius = r;}
	public int getRadius() {return radius;}
	
	public double getArea() {return Math.PI * this.radius * this.radius;}
	public double getCircum() {return 2 * this.radius * Math.PI;}
	
}