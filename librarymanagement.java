import java.util.*;
abstract class Admin {


}
	class Books extends Admin{
	String booname = null;
	int year ;
	//Books(String)
	public String getName() {
		return booname;
	}
	public void setName(String name) {
		this.booname = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
class Author extends Books{
	String author = null;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
class Magazine {
	String magazine =null;
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMagazine() {
		return magazine;
	}

	public void setMagazine(String magazine) {
		this.magazine = magazine;
	}
	void display(String aname , String bname) {
		System.out.println("Book :"+aname+","+"Author:"+bname);
	}
}
public class librarymanagement{
	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no.of books");
       int n = sc.nextInt();
       sc.nextLine();
       String b = sc.nextLine();
       for(int i =0 ; i<n ;i++) {
    	   
    	   if(b.equals("Book"))
    	   {
       //String b = sc.nextLine();
    	   String bookname = sc.nextLine();
    	   String authorname = sc.nextLine();
    	   int year = sc.nextInt();
    	   Books b1 = new Books();
    	   Author a1 = new Author();
    	   b1.setName(bookname);
    	   System.out.println(b1.getName());
    	   a1.setAuthor(authorname);
    	   System.out.println(a1.getAuthor());
    	   b1.setYear(year);
    	   System.out.println(b1.getYear());
       }else {
    	   String magazine = sc.nextLine();
    	   int id = sc.nextInt();
    	   Magazine m1 = new Magazine();
    	   m1.setMagazine(magazine);
    	   System.out.println(m1.getMagazine());
    	   m1.setId(id);
    	   System.out.println(m1.getId());
       }
       }
       sc.close();
       
       
	}

}
