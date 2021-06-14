import java.util.Scanner;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {

        //FichierCompte fc = new FichierCompte();
        Service s = new Service();
        int choix;
        choix = menu();
        
        switch (choix) 
        {
            case 1:
                Local c; 
                c = s.createLocal();
                s.addToLocalTable(c);

                break;
            case 2:
                System.out.println("Connexion : ");
                break;
        }
    }

    

    //Menu
    public static int menu()
    {
        System.out.println("Liste des biens ... \n\n\n");
        int choix;
        System.out.println(
            "Menu"
        + "\n 1 - Creer un compte"
        + "\n 2 connexion"
        + "\n \n Faites votre choix"
        );
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }

    public static int menuAdmin()
    {
        int choixAdmin;
        System.out.println(
            " *********** Menu Admin ********** "
            + "\n 1 - Ajouter un local"
            + "\n 2 - Lister les locaux des clients"
            + "\n 3 - Lister les locaux par type"
            + "\n 4 - Lister les locaux disponible"
            + "\n 5 - Quitter"
        );
        choixAdmin = Integer.parseInt(scanner.nextLine());
        return choixAdmin;
    }

    public static int menuVisiteur()
    {
        int choixVisiteur;
        System.out.println(
            " *********** Menu Visiteur ********** "
            +"\n 1 - Lister les locaux disponobles"
            +"\n 2 - Lister les mes reservations"
            +"\n 3 - Annuler reservation"
            +"\n 4 - Lister les "
        );
        choixVisiteur = Integer.parseInt(scanner.nextLine());
        return choixVisiteur;
    }

   
}
