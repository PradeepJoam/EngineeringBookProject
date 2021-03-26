package com.joam.book;
import java.util.Scanner;

public class BookDetails {
	public static void main(String[] args) {
		Scanner inputKeybord =new Scanner(System.in);
		Book objBook[]=new Book[3];
		int i=0;
		do{
			System.out.println("Enter the BookNo");
			int bookNo=inputKeybord.nextInt();
			inputKeybord.nextLine();
			System.out.println("Enter the BookTitle");
			String title=inputKeybord.nextLine();
			
			System.out.println("Enter the AuthorName");
			String author=inputKeybord.nextLine();
			System.out.println("Enter the Price");
			float price=inputKeybord.nextFloat();
			if(title.length()>=4) {
				if(price>=1 && price<=5000) {
					objBook[i]=new Book(bookNo, title, author, price);
					i++;
					}else System.out.println("price must be in the range 1 to 5000 - try again");
			}else System.out.println("Book title less then 4 characters - try again");
		}while(i<3);
		System.out.println("Enter the BookNo for searching");
		int searchBookNo=inputKeybord.nextInt();
		int flag=0;
		for(Book searchBookObject:objBook)
		{
			if(searchBookObject.getBookNo()==searchBookNo)
			{
				System.out.println(searchBookObject);
			}
			else { flag=1;}
		}
		if(flag==1)System.out.println("BookNo not exist");
		EngineeringBook egBookObj=new EngineeringBook();
		System.out.println("Enter the BookNo");
		egBookObj.setBookNo(inputKeybord.nextInt());
		inputKeybord.nextLine();
		System.out.println("Enter the BookTitle");
		egBookObj.setTitle(inputKeybord.nextLine());
		System.out.println("Enter the AuthorName");
		egBookObj.setAuthor(inputKeybord.nextLine());
		System.out.println("Enter the Category");
		egBookObj.setCategory(inputKeybord.nextLine());
		System.out.println("Enter the Price");
		egBookObj.setPrice(inputKeybord.nextFloat());
		System.out.println(egBookObj);
		inputKeybord.close();
	}
}
