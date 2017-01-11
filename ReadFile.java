import java.io.*;
class ReadFile {
	public static void main (String[]args){
		try{
			File myFile =new File("");
			FileReader fileReader =new FileReader(myFile);
			
			BufferedReader reader =new BufferedReader(fileReader) ;
		//make a String variable to hold each line as the line is read
			
			String line =null;
			
			while ((line =reader.readLine())!=null){
				System.out.println(line);
			}
			reader.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
 }
