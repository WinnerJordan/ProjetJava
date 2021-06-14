/* 
    creation de compte ()
    addlocal()
    listerLocal()
    connexion()
    addChambre()
    addAppartement()
    
    
    */
import java.util.Scanner;
public class Service {

    


    private int taille = 10;
    private int nombreCompte;
    private int nombreLocaux;
    
    Local[] tableauDeLocaux = new Local[taille];
    Client[] tableauDeCompte = new Client[taille];
    
    
    public static Scanner scanner = new Scanner(System.in);
    Validator valide = new Validator();


    public Client createClient()
    {
        System.out.println("Numero de la carte d'identite : ");
                String nci = scanner.nextLine();          
                while (!valide.isNci(nci))
                {
                    System.out.println("NCI incorrecte. Entrer le nci du client : ");
                    nci = scanner.nextLine();
                }
                System.out.println("Nom du client : ");
                String nom = scanner.nextLine();
                System.out.println("Prenom du client : ");
                String prenom = scanner.nextLine();
                String nomComplet = nom + " " + prenom;
                System.out.println(nomComplet);
                System.out.println("Numero de telephone du client (ex 778179211) : ");
            
                int tel = Integer.parseInt(scanner.nextLine());
                //System.out.println(isPhoneNumber(tel)); 
                while (!valide.isPhoneNumber(tel))
                {
                    System.out.println("Numero de telephone incorrecte, saisir a nouveau : ");
                    tel = Integer.parseInt(scanner.nextLine());
                }
                System.out.println("Emain du client : ");
                System.out.println("Adresse du client : ");
                String adresse = scanner.nextLine();
                String email = scanner.nextLine();
                //System.out.println(validateEmail("rwiniga@gmail.com"));
                while (!valide.isMail(email))
                {
                    System.out.println("Email incorrecte, saisir a nouveau : ");
                    email = scanner.nextLine();
                }
                Client c = new Client (nci, nomComplet, tel, adresse, email);
                return c;
    }
    
    public void addAccountToTable(Client client)
    {
        if (nombreCompte < taille){
            tableauDeCompte[nombreCompte] = client;
            nombreCompte ++;
        } 
        else {
            System.out.println("Tableau de compte plein");
        }

    }

    public Local createLocal()
    {
        System.out.println("Localisation : ");
        String localisation = scanner.nextLine();
        System.out.println("Prix : ");
        int prix = Integer.parseInt(scanner.nextLine());
        System.out.println("Taux de location : ");
        float tauxLoc = Float.parseFloat(scanner.nextLine());
        Local l = new Local(localisation, prix, tauxLoc);
        return l;
    }

    public void addToLocalTable(Local l)
    {
        if (nombreLocaux < taille){
            tableauDeLocaux[nombreLocaux] = l;
            nombreLocaux ++;
        } 
        else {
            System.out.println("Tableau de compte plein");
        }
    }
/*
    public Chambre addChambre(){
        System.out.println("Localisation : ");
        String localisation = scanner.nextLine();

    }

*/

}