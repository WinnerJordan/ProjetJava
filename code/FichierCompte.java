import java.util.*;
import java.io.*;
import static java.lang.System.*;
//import java.util.date;

public class FichierCompte
{
    public static void insertion(Client c)
    {
        File f = new File("fichierCompte.txt");
        if (!f.exists())
        {
            try
            {
                f.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            try 
            {
                FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write(c);
            bw.close();
            w.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    
}