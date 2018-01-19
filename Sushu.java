
public class Sushu {
	public static void main (String[] args) {
		int a,i,m,n;
		for(a=2;a<=10000;a++) {
			if(a==2)           { System.out.print(2+" "); a++; }
			for(i=2;i<a;i++)   {
				m=a%i;
				if(m==0)   { break; }
				if (m!=0)  {  
			       		if(i==a-1) { 
					   System.out.print(a+" ");
					}
				}
			}
				
		}
	}
	
}

