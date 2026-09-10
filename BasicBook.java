
package LEC_08_Objectanclass.EX1.Ex6;

import java.util.Scanner;

public class BasicBook {
    private String title;
    private String author;
    private double price;
    public BasicBook(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
}
    public BasicBook(){
}
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tieu de: ");
        this.title =scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        this.author =scanner.nextLine();
        System.out.println("Nhap gia: ");
        this.price = scanner.nextDouble();
    } 
    public void output(){
        System.out.println(title+" - " + author + " - " + price );
    }
    public void displayBookinfo(){
        System.out.println(title +" - "+ author+ " - " + price );
    }
  }