
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wordclass {
	public static void main(String[] args) throws Exception{
		
		char ch;
        String line;
        int count = 0;
        ArrayList<String> words =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text to be written to a file");
        String text="";
        while(sc.hasNextLine()){
            text = sc.nextLine();
            if(text.length()==0){
                break;
            }
            words.add(text+ " ");
        }

        FileWriter fWriter = new FileWriter("src/input.txt");
        for (int i = 0; i < words.size(); i++) {
            fWriter.write(words.get(i));
        }

        fWriter.close();
        System.out.println("File with data given has been written successfully");
        FileReader f = new FileReader("src/input.txt");
        BufferedReader br = new BufferedReader(f);
        while ((line = br.readLine()) != null) {

            String [] str = line.split(" ");
            count += str.length;
        }
        System.out.println(count);
    }
}
		
		
		
		
	
