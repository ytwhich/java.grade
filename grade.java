import java.util.Scanner;

public class grade  {
    public static void main(String[] args)
    {
        float[] marks = new float[8];//new way to create a array in with passing the size in array
        float sum =0,avg;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a subject number you want");

        for(i=0;i<8;i++)
          marks[i]=sc.nextFloat();

          for(i=0;i<8;i++)
          sum=sum+marks[i];
          avg=sum/8;

          System.out.print("\nGrade = ");
          if (avg >= 94)
          System.out.println("A");
      else if (avg >= 90 && avg < 94)
          System.out.println("A-");
      else if (avg >= 87 && avg < 90)
          System.out.println("B+");
      else if (avg >= 83 && avg < 87)
          System.out.println("B");
      else if (avg >= 80 && avg < 83)
          System.out.println("B-");
      else if (avg >= 77 && avg < 80)
          System.out.println("C+");
      else if (avg >= 73 && avg < 77)
          System.out.println("C");
      else if (avg >= 70 && avg < 73)
          System.out.println("C-");
      else if (avg >= 67 && avg < 70)
          System.out.println("D+");
      else if (avg >= 63 && avg < 67)
          System.out.println("D");
      else if (avg >= 60 && avg < 63)
          System.out.println("D-");
      else
          System.out.println("F");

      // Close the Scanner
      
  }
}





