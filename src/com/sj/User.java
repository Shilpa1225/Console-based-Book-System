/**
 * 
 */
package com.sj;

/**
 * @author skamsani2
 *
 */
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DBbooks db=new DBbooks();
		
		char b;
		do {
			System.out.println("press one to view books");
			System.out.println("press 2 to search book by the title");
			System.out.println("press 3 to insert a book");
			System.out.println("press 4 to delete a book");
			System.out.println("press 5 to update the book");
			
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				db.viewAll();
				break;
			case 2:
				System.out.println("enter the title of the book");
				String name=sc.next();
				Book rb=db.viewByName(name);
				System.out.println(rb);
				
				//db.viewById(name);
				break;
			case 3:
				
				System.out.println("enter book id");
				int iid=sc.nextInt();
	            System.out.println("enter book name");
	            String iname=sc.next();
	            System.out.println("enter boook price");
	            double price=sc.nextDouble();
	            System.out.println("enter author name");
	            String author=sc.next();
	            Book ib=new Book(iid,iname,author,price);
	            db.insert(ib);
	            break;
				
			case 4:
				System.out.println("enter id of the book you want to delete");
				int id1=sc.nextInt();
				db.delete(id1);
				break;
			case 5:
				System.out.println("enter the id ");
				int idu=sc.nextInt();
				System.out.println("enter the price");
				double p=sc.nextDouble();
				db.update(idu,p);
				break;
				default:
					break;
			}
		
		System.out.println("press y for main menu");
		b=sc.next().charAt(0);
		}while(b=='Y'||b=='y');
		
		
		
		
		
		
		
		}
		
		
		
		
	}
	
	
	
	
	

