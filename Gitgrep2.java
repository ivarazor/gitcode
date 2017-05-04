package gitgrep;
import java.util.*;
import java.util.Scanner;
 
public class Gitgrep {
 

	public static void main(String[] args) {
		
		if (args.length == 0)
		{
			System.out.print("Введите текст:");
		}
		Scanner in = new Scanner(System.in);
		while (in.hasNext("Hello"))
		{
			String str = in.nextLine();
			Scanner s = new Scanner(str);
			for (String iterStr: args)

				{
					System.out.println(str);
					break;
				}
			s.close();
						
		}
		in.close();
	}
 
}
    

