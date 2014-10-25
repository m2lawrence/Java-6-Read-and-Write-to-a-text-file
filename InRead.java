//Mike's how to read a text file in Java 6.
import java.io.*;
import static java.lang.System.*;

class InRead {
    public static void main (String[] args) {
        try{
            FileReader fr = new FileReader("Credits.txt");
            //filereader Object, with the file name.
            BufferedReader br = new BufferedReader(fr);
            //bufferedReader object which is the thing that actually does the reading from the filereader Object.
            
            String str; //Here I have a string.
            while ((str = br.readLine()) != null) //Here it reads a line at a time.
            {
                out.println(str + "\n");  //Here it prints out the string with a new line after each part.
            }
            
            br.close();  //Here I close the file reader.
        } catch (IOException e) {
            out.println("File not found Mike!");  //My error handling to prevent my programming from crashing.
        }
    }
}