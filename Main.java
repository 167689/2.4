import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int c;
    String wy;
    
     Scanner z = new Scanner(System.in);
       for(c=0;c<10000;c++)
        {
         

           String x = z.nextLine();
          int b = x.indexOf("q");
         
            if(b>=0)
          {
             x = x.substring(0, b);
            }
          
          System.out.println(x);
          }

        z.close();
  }
}