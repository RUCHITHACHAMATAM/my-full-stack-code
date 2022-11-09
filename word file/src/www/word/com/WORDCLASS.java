package www.word.com;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.PrintWriter;
	import java.util.Scanner;

	
	public class WORDCLASS {
		

		
		public static void main(String[] args) throws Exception{
			char ch;
			String line;
			int count=0;
			String[] words;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a text to be written to a file");
			String text=sc.nextLine();
			FileWriter fWriter = new FileWriter("D:\\word count file2.txt");
			fWriter.write(text);
			fWriter.close();
			System.out.println("File with data given has been written successfully");
			FileReader f=new FileReader("D:\\word count file2.txt");
	        BufferedReader br=new BufferedReader(f);
	         while((line=br.readLine())!=null) {
	        	
	        	words=line.split(" ");
	        	count+=words.length;
	        	}
		
	        
	         System.out.println("number of words "+count);
	        }
	}