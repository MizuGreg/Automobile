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
     while (true)
     {
      String comando=new String();
      InputStreamReader input=new InputStreamReader(System.in);
      BufferedReader tastiera=new BufferedReader (input);
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
   public static void accellera (int velocita)
   {
        velocita=velocita+5;
        if (velocita>=90)
        {
            System.out.println ("La tua velocità ora è "+velocita+" km/h.\nAttenzione, stai andando troppo veloce!");
        }
        else
        {
            System.out.println("La tua velocità ora è "+velocita+ "km/h.");
        }
   }
   public static void frena (int velocita)
   {
        velocita-=10;
        if (velocita==0)
        {
            System.out.println ("Sei fermo adesso!");
        }
        else if (velocita>0)
        {
            System.out.println ("La tua velocità ora è "+velocita+" km/h.");
        }
        else
        {
            System.out.println ("Non puoi frenare da fermo!");
            velocita+=10;
        }
   }
}