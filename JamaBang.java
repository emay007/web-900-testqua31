import java . util.*;
class JamaBang {
   public static void main (String [] args) {
      Scanner sc = new Scanner (System.in);
      char p1,p2,p3,p4;
      char q1,q2,q3,q4;
      
      System.out.print("Enter first p: ");
      p1 = sc.nextLine().charAt(0);
      System.out.print("Enter second p: ");
      p2 = sc.nextLine().charAt(0);
      System.out.print("Enter third p: ");
      p3 = sc.nextLine().charAt(0);
      System.out.print("Enter fourth p: ");
      p4 = sc.nextLine().charAt(0);
      System.out.print("Enter first q: ");
      q1 = sc.nextLine().charAt(0);
      System.out.print("Enter second q: ");
      q2 = sc.nextLine().charAt(0);
      System.out.print("Enter third q: ");


      System.out.print("Enter fourth q: ");
      q4 = sc.nextLine().charAt(0);

      System.out.println("p\tq\tp||q");
       System.out.print(p1+"\t"+q1+"\t");
      if((p1=='t'||p1=='T')&&(q1=='t'||q1=='T'))
      System.out.println("T");
      else if((p1=='t'||p1=='T')&&(q1=='f'||q1=='F'))
      System.out.println("T");
      else if((p1=='f'||p1=='F')&&(q1=='t'||q1=='T'))
      System.out.println("T");
      else

      System.out.println("F");
      
      System.out.print(p2+"\t"+q2+"\t");

      if((p2=='t'||p2=='T')&&(q2=='t'||q2=='T'))
      System.out.println("T");
      else if((p2=='t'||p2=='T')&&(q2=='f'||q2=='F'))
      System.out.println("T");
      else if((p2=='f'||p2=='F')&&(q2=='t'||q2=='T'))
      System.out.println("T");
      else
      System.out.println("F");

      
      System.out.print(p3+"\t"+q3+"\t");
      if((p3=='t'||p3=='T')&&(q3=='t'||q3=='T'))
      System.out.println("T");
      else if((p3=='t'||p3=='T')&&(q3=='f'||q3=='F'))
      System.out.println("T");
      else if((p3=='f'||p3=='F')&&(q3=='t'||q3=='T'))
      System.out.println("T");
      else
      System.out.println("F");


      System.out.print(p4+"\t"+q4+"\t");
      if((p4=='t'||p4=='T')&&(q4=='t'||q4=='T'))
      System.out.println("T");
      else if((p4=='t'||p4=='T')&&(q4=='f'||q4=='F'))
      System.out.println("T");
      else if((p4=='f'||p4=='F')&&(q4=='t'||q4=='T'))
      System.out.println("T");
      else
      System.out.println("F");
      
   }
}





















































































































































