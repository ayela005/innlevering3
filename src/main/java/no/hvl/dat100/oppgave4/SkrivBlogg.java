package no.hvl.dat100.oppgave4;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class SkrivBlogg {
	
public static boolean skriv(Bloggsamling, String mappe, String filnavn) {
   
    try (PrintWriter writer = new PrintWriter(new FileWriter(mappe + "/" + filnavn))) {
       
        writer.print(samling.toString());
       
    } catch (IOException e) {
       
        System.out.println("En feil oppstod ved skriving til fil: " + e.getMessage());
        return false;  
    }
}
}




