/**
 * 
 */
package com.sj;

/**
 * @author skamsani2
 *
 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class DBbooks{
	Scanner sc=new Scanner(System.in);
	TreeSet<Book>tset;
	public DBbooks() {
		in();
	}

public void in() {
	tset=new TreeSet<Book>();
	Book b1=new Book(1,"wings of fire","abc",50);
	Book b2=new Book(2,"wings of fire1","abc",20);
	Book b3=new Book(3,"wings of fire11","abc",20);
tset.add(b1);
tset.add(b2);
tset.add(b3);

}
public void viewAll() {
	Iterator<Book>itr=tset.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
}
}
 public Book viewByName(String name) {
	 for(Book b:tset) {
		// if(b.bookId==id||b.title.equals(name)) {
			if(b.title.equals(name)) {
		// return b ;
		 System.out.println(b);
 }
	 }
	return null;
 }


public void insert(Book b) {
	
	tset.add(b);
	System.out.println("data inserted");
}
  

     public void delete(int id) {
    	 Iterator<Book>itr=tset.iterator();
    	if(id==itr.next().bookId) {
    		itr.remove();
    		System.out.println("Book Deleted");
    	 }
     else {
    		 System.out.println("No Book Found by this Id");
     }

}
          
        public void update(int id,double price) {
        	Iterator<Book>itr=tset.iterator();
        	while(itr.hasNext()) {
        		Book bTemp=itr.next();
        		if(bTemp.bookId==id) {
        			String title=bTemp.title;
        			String author=bTemp.author;
        			itr.remove();
        			Book b=new Book(id,title,author,price);
        			tset.add(b);
        			System.out.println("Details Updated Successfully");
        		}
        	}







}

		public void viewById(String name) {
			// TODO Auto-generated method stub
			
		}






}















