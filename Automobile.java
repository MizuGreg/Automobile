import java.io.*;
public class Automobile
{
   public static int velocita=50;
   public void main (String args[])
   {
     new Automobile(velocita);
   } 
   public Automobile (int velocita)
   {
     String comando=new String();
     InputStreamReader input=new InputStreamReader(System.in);
     BufferedReader tastiera=new BufferedReader (input);
       while (true)
     {
      try
      {
          comando= tastiera.readLine();
      }
      catch (Exception e)
      {
          System.out.println ("Si è verificato il seguente errore:\n"+e);
          System.exit(-1);
      }
      if (comando.equals("A"))
      {
         Automobile.accellera(velocita);
      }
      else if (comando.equals("F"))
      {
         Automobile.frena(velocita);
      }
      else
      {
         System.out.println ("Comando non valido. Inserire A per accellerare o F per frenare.");
      }
     }
   }
   public static void accellera (int velocita2)
   {
        velocita2=velocita;
        velocita+=5;
        velocita=velocita2;   
        if (velocita>=90)
        {
           System.out.println ("Attenzione, stai andando troppo veloce!");
           System.out.println("La tua velocità ora è "+velocita+" km/h.");
        }
        else
        {
           System.out.println ("La tua velocità ora è "+velocita+" km/h.");
        }
   }
   public static void frena (int velocita2)
   {
       velocita2=velocita; 
       if (velocita==0)
        {
            System.out.println ("Non puoi frenare da fermo!");
        }
        else if (velocita>0)
        {
            velocita-=10;
            velocita=velocita2;
            System.out.println ("La tua velocità ora è "+velocita+" km/h.");
        }
        else
        {
        }
   }
}