//Mike's how to write a text file in Java 6.
import java.io.*;
import static java.lang.System.*;

class OutWrite {
    public static void main (String[] args) {
        try{
            FileWriter fw = new FileWriter("Credits.txt");
            //fileWriter Object, with the file name.
            PrintWriter pw = new PrintWriter(fw);
            //bufferedWriter object which is the thing that actually does the writing to the fileWriter Object.
            
            pw.println("Mike's reading and writing to a text file in Java 6.");
            pw.println("Mike's Course: 30 credits");
            pw.println("Mike's Year: 120 credits");
            pw.println("Mike's Degree: 360 credits");
            
            pw.close();  //Here I close the file writer.
        } catch (IOException e){
            out.println("Error here Mike!");  //My error handling to prevent my programming from crashing.
        }
    }
}