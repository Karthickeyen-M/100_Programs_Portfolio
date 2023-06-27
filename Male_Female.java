import java.util.*;
abstract class Male_Female {
	
}
	class female extends Male_Female{
		boolean gender = false;
		boolean V (boolean G) {
			System.out.print("You're a Bitch");
			return gender;
		}
		
	}
	class male extends Male_Female{
		boolean gender = true;
		boolean P (boolean F) {
			System.out.print("You're a Sigma");
			return gender;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner (System.in);
            boolean name = sc.nextBoolean();
            male m = new male();
            female f = new female();
            if(name == false) {
            	
            	System.out.print(f.V(false));
            }else {
            	System.out.print(m.P(true));
            }
            sc.close();
            
            	
            

}
	}
