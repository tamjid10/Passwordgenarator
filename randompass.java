import java.util.Scanner;
public class randompass{
  public static void main(String[] args) {
    System.out.println("Enter the length of a password:");
    Scanner input = new Scanner(System.in);
    int Len = input.nextInt();
    int lup= 1,x,y,z;
    char m;
    String s1="";
    while (lup != Len+1) {
      int var1= 1 + (int)(Math.random()*3);
      switch (var1) {
        case 1:
         x= 48 + (int)(Math.random()*9);
         m=(char)x;
         s1 = s1 + m;

         lup++;
         break;


         case 2:
          x= 65 + (int)(Math.random()*30);
          m=(char)x;
          s1 = s1 + m;

          lup++;
          break;

          case 3:
           x= 97 + (int)(Math.random()*25);
           m=(char)x;
           s1 = s1 + m;

           lup++;
           break;



      }


    }
      System.out.println(s1);
  }
}
