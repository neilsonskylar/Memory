/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
 
public class main_class {
    public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
 
       System.out.println("Enter the total, or max, score: ");       
       total = inputNumScanner.nextInt();
 
       System.out.println("Enter the score obtained: ");
       score = inputNumScanner.nextInt();
 
       percentage = (score * 100/ total);
 
       System.out.println("The percentage is = " + percentage + " %");
    }
}