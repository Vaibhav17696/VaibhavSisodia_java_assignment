package arraysex;
import java.util.*;

public class StringSplit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of a student of 5 subjects separated by comma:");

        String strMarks =  sc.nextLine();

        String[] marks = strMarks.split(",");

        int total = 0;
        for(String s: marks)
        {
           int m = Integer.parseInt(s);

           total+=m;

        }

        System.out.println("Marks of the student are as follows:"+strMarks+" and their sum is="+total);
        sc.close();
 
    }

}
