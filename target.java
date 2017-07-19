package guvi;
import java.util.*;
public class target {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array Size");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Target Number");
        int t=s.nextInt();
        System.out.println("Enter Array Elememts");
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        	if(a[i]+a[j]==t)
        	{
        	m=1;
        	System.out.printf("%d + %d = %d",a[i],a[j],t);
        	break;
        	}
        	}
            }
        if(m==0)
        	System.out.println("Null");
        
        s.close();
	}


}
