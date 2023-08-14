package lib;
import java.util.*;
public class librarymanagement {
	static ArrayList<String>books = new ArrayList<>();
	static ArrayList<String>authors = new ArrayList<>();
	static ArrayList<Integer>years = new ArrayList<>();
	static ArrayList<Integer>ids = new ArrayList<>();
	static ArrayList<String>titles = new ArrayList<>();
	static HashMap<String,Integer>h1 = new HashMap<>();
	static HashMap<String,Integer>h2 = new HashMap<>();
		public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
//	       System.out.println("Enter your role (Admin/User): ");
//	       String role = sc.nextLine();
//	       if(role.equals("Admin")){
	       System.out.println("Enter the no.of entries: ");
	       int n = sc.nextInt(),f=0;
	       sc.nextLine();
	       for(int i=0 ; i<n ;) {
	    	   f=0;
	    	   System.out.println("Enter your choice (Book/Magazine): ");
	    	   String b = sc.nextLine();
	    	   if(b.equals("Book"))
	    	   {
	    		   f=1;
	    	   System.out.println("Enter the bookname: ");
	    	   String bookname = sc.nextLine();
	    	   System.out.println("Enter the Authorname: ");
	    	   String authorname = sc.nextLine();
	    	   System.out.println("Enter the year of publishing: ");
	    	   int year = sc.nextInt();
	    	   Books b1 = new Books();
	    	   Author a1 = new Author();
	    	   b1.setName(bookname);
	    	   System.out.println(b1.getName());
	    	   a1.setAuthor(authorname);
	    	   System.out.println(a1.getAuthor());
	    	   b1.setYear(year);
	    	   System.out.println(b1.getYear());
	    	   i++;
	    	   }
	    	   else if(b.equals("Magazine")){
	    		   f=1;
	    	   System.out.println("Enter the title of the magazine: ");
	    	   String magazine = sc.nextLine();
	    	   System.out.println("Enter the id of the Magazine: ");
	    	   int id = sc.nextInt();
	    	   Magazine m1 = new Magazine();
	    	   m1.setMagazine(magazine);
	    	   System.out.println(m1.getMagazine());
	    	   m1.setId(id);
	    	   System.out.println(m1.getId());
	    	   i++;
	    	   }
	    	   if(f==0)System.out.println("Enter a valid entry...");
	       }
	       
	       System.out.println("Book entries are as follows \n"+h1);
	       System.out.println("Magazine entries are as follows \n"+h2);
	       //}
//	       else{
//	    	   
//	       }
		}
}









package lib;

public class Books extends librarymanagement{
	String bookname;
	int year;
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String bookname) {
		this.bookname = bookname;
		books.add(bookname);
		if(!h1.containsKey(bookname)){
			h1.put(bookname, 1);
		}
		else{
			int v = h1.get(bookname);
			h1.put(bookname, ++v);
		}
	}

	public String getName() {
		return bookname;
	}

	public void setYear(int year) {
		this.year = year;
		years.add(year);
	}

	public int getYear() {
		return year;
	}

}





package lib;

public class Author extends librarymanagement{
	String authorname;
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public void setAuthor(String authorname) {
		this.authorname = authorname;
		authors.add(authorname);
	}

	public String getAuthor() {
		return authorname;
	}

}





package lib;

public class Magazine extends librarymanagement{
	String magazine;
	int id;
	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	public void setMagazine(String magazine) {
		this.magazine = magazine;
		titles.add(magazine);
		if(!h2.containsKey(magazine)){
			h1.put(magazine, 1);
		}
		else{
			int v = h1.get(magazine);
			h1.put(magazine, ++v);
		}
	}
	public String getMagazine() {
		return magazine;
	}

	public void setId(int id) {
		this.id = id;
		ids.add(id);
	}

	public int getId() {
		return id;
	}

}



