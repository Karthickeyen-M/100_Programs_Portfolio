import java.util.*;
public class OnlyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Elements");
		int n = sc.nextInt();
		ArrayList<Double> d = new ArrayList<Double>();
		for(int i=0 ; i<n ; i++) {
			d.add(sc.nextDouble());
		}
		System.out.print(d.size());
		sc.close();
	}

}

