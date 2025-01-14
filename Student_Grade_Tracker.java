import java.util.Scanner;

public class Student_Grade_Tracker 
{
     public static void main(String[] agrs)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Total Number Of Student : ");
        int NumberOfStuden=sc.nextInt();

        int[] grade= new int[NumberOfStuden];

        for(int i=0; i< NumberOfStuden; i++)
        {
            System.out.println("Student no."+ (1+i) +":");
            grade[i]=sc.nextInt();
        }

       int sum=0;
        int  min=grade[0];
        int max=grade[0];

        for(int grades : grade)
        {
            sum+=grades;
            if(grades > max)
            {
                max=grades;
            }
            if(grades < min)
            {
                min=grades;
            }
        }

        double average=(double)sum/NumberOfStuden;

        System.out.println("---------Result---------");
        System.out.println("Highest Grade  : "+max);
        System.out.println("Lowest Grade   : "+min);
        System.out.println("Avarage Grade  : "+average);

        sc.close();

    }
}
