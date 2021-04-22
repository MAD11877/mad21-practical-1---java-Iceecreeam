import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */


     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    int num = in.nextInt();

    for(int i = num; i > 0;i--){
      numbers.add(in.nextInt());
    }


    int mode = -1;
    int freq = -1;

    for (int i = 0; i < num; i++) {
        int currnum = numbers.get(i);
        int numfreq = 0;

        for (int t = 0; t < num; t++) {
            int thisnum = numbers.get(i);
            if (currnum == thisnum){
              numfreq++;
            }
        }

      if (numfreq > freq){
        mode = currnum;
        freq = numfreq;
      }

    }
    
    System.out.println(mode);
    
  }
}
