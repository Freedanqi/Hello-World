
public class Tables {
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				System.out.print( j );
				System.out.print("x");
				System.out.print( i );
				System.out.print("=");
				System.out.print(j*i);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
