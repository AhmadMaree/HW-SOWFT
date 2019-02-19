package ahm;
import java.util.ArrayList;

public class sho {

	public static int count=0 ;
	public static int price=0 ;
	
	
	
	 public static ArrayList <Integer>ar=new ArrayList<Integer>() ;
	public static void addbook(int price1) {
	 ar.add(price1);
	 count = ar.size();
	 price+=price1 ;
	}
	
	

}