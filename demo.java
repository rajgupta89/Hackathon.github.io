import java.util.Scanner;

public class demo {
  public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[] m=new int[n];
      int a=0,b=0;
      for (int i = 0; i < m.length; i++) {
          m[i]=in.nextInt();
      }
      int small=m[0];
      for (int i = 0; i < m.length; i++) {
          if (m[i]<small) {
              small=m[i];
          }
      }
      for (int i = 0; i < m.length; i++) {
          if (n<m[i]) {
              a++;
          } else {
              b++;
          }
      }
      if (a==n) {
          System.out.println(n);
      } else {
          System.out.println(small);
      }
  }    
}