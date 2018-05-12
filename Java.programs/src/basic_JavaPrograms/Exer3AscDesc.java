package basic_JavaPrograms;
import java.util.Scanner;

public class Exer3AscDesc
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int tenNums[]=new int[10], orderedNums[]=new int[10];
        int greater;
        String choice;

        //get input
        System.out.println("Enter 10 integers : ");
        for (int i=0;i<tenNums.length;i++)
        {
            System.out.print(i+1+"=> ");
            tenNums[i] = scan.nextInt();
        }
        System.out.println();

        //imperfect number ordering algorithm
        for(int indexL=0;indexL<tenNums.length;indexL++)
        {
            greater=0;
            for(int indexR=0;indexR<tenNums.length;indexR++)
            {
                if(tenNums[indexL]>tenNums[indexR])
                {
                    greater++;
                }
            }
            orderedNums[greater]=tenNums[indexL];
        }

        //ask if ascending or descending
        System.out.print("Display order :\nA - Ascending\nD - Descending\nEnter your choice : ");
        choice = scan.next();

        //output the numbers based on choice
        if(choice.equalsIgnoreCase("a"))
        {
            for(greater=0;greater<orderedNums.length;greater++)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }
        else if(choice.equalsIgnoreCase("d"))
        {
            for(greater=9;greater>-1;greater--)
            {
                System.out.print(orderedNums[greater]+" ");
            }
        }
        scan.close();
    }
}