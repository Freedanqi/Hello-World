import java.io.*;
public class Car {
   public static void main(String[] args) {

      BCar bc = new BCar("4","red","2000","BMW");
      bc.Run(1,0);
      DCar dc = new DCar("4","blue","2500","Benz");
      dc.Run(1,1);

   }
}
abstract class OCar {
	
   private String tirenum;
   private String color;
   private String weight;
 
   OCar(String tirenum,String color,String weight) {
      this.tirenum=tirenum;
      this.color=color;
      this.weight=weight;
   }
 
   public abstract void Run(int a,int i);
}
   

class BCar extends OCar {
   private String trademark1;
   BCar(String t,String c,String w,String B) {
      super(t,c,w);
      trademark1=B;
      System.out.println("\n"+"The car is "+B+" "+t+" "+c+" "+w);
   }
   
   public void Run(int a,int i) {
      System.out.print("v= ");
      System.out.print(i);
      System.out.print(" a= ");
      System.out.print(a);
      System.out.println();
      if(i!=0) {
         System.out.println("The car is very crazy!"); 
         System.out.println();
      }
      if(i==0) {
         if(a==0) {
            System.out.println("The car lacks energy!"); 
	 }
	 if(a>0) {
            System.out.println("The car is accelerating!");
	 }

	 if(a<0) {
            System.out.println("The car is slowing!");
	 }
         System.out.println();
      }
   }
}
	
class DCar extends OCar {
   private String trademark2;
   DCar(String t,String c,String w,String D) {
      super(t,c,w);
      trademark2=D;
      System.out.println("\n"+"The car is "+D+" "+t+" "+c+" "+w);
   }

   public void Run(int a,int i) {
      System.out.print("v= ");
      System.out.print(i);
      System.out.print(" a= ");
      System.out.print(a);
      System.out.println();
      if(i!=0) {
         System.out.println("The car is very crazy!"); 
         System.out.println();
      }
      if(i==0) {
         if(a==0) {
            System.out.println("The car lacks energy!"); 
	 }
	 if(a>0) {
            System.out.println("The car is accelerating!");
	 }

	 if(a<0) {
            System.out.println("The car is slowing!");
	 }
         System.out.println();
      }
   }
}

