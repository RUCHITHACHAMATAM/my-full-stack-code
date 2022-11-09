import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Word {
	public static void main(String[] args) throws Exception	{
		String line;
		int count=0;
		String[] words;
		
		FileReader f=new FileReader("D:\\word count file.txt");
        BufferedReader br=new BufferedReader(f);
         while((line=br.readLine())!=null) {
        	
        	words=line.split(" ");
        	count+=words.length;
        	}
	
        
         System.out.println("number of words "+count);
        }
}
	


        


       
        
        
		
		

	

        

