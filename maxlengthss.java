package guvi;
import java.util.*;
public class maxlengthss{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int n=a.length();
		StringBuffer sb=new StringBuffer(a);
		if(sb.reverse().toString().equals(a)){
		System.out.println("Maximum substring length :"+(n-1));
		}
		else{
		System.out.println("Maximum substring length :"+n);
		}
		s.close();
}
}
