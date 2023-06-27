import java.util.*;
public class Printall {

	static void printall(ArrayList<String> p) {
		@SuppressWarnings("rawtypes")
		Iterator t = p.iterator();
		System.out.print( "Result : ");
		while(t.hasNext()) {
			System.out.print( t.next()+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
       ArrayList<String>s = new ArrayList<>();
       System.out.println("Enter the no.of Elements : ");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter the Elements : ");
          for(int i=0; i<n ; i++) {
        	  s.add(sc.nextLine());
          }
          printall(s);
         sc.close();
	}

}



