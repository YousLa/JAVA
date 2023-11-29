import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui demande trois nombres entiers à l'utilisateur.
        // Le programme affichera tous les nombres entre les deux premiers données
        // et fera des sauts équivalents au troisième nombre.
        
        // Exemple : Si l'utilisateur entre 0, 10 et 2; Le programme affichera :
        // 1 3 5 7 9
        
        // 1. Demander 3 entier à l'utilisateurs
        System.out.println("Veuillez entrer le nombre de départ");
        int nombre1 = readNextInt();
        
        System.out.println("Veuillez entrer le nombre d'arriver");
        int nombre2 = readNextInt();
        
        System.out.println("Veuillez entrer le nombre d'incrémentation");
        int nombre3 = readNextInt();
        
        int compteur = 0;
        
        
        // On vérifie d'abord quelle nombre est plus grand que l'autre pour avoir un
        // compteur de départ et savoir combien de fois notre boucle va boucler
        if (nombre1 > nombre2) {
            // Je soustrais le grand nombre au petit pour avoir la différence et boucler
            int diff = nombre1 - nombre2;
            
            // Si le nombre3 est négatif
            if(nombre3 < 0){
            
                compteur = diff;
                
            while (compteur >= nombre2) {
                
                System.out.println(compteur);
                
                compteur += nombre3;
            
            }
                
            } else if (nombre3 > 0) {
                
              while (compteur <= diff) {
            
                System.out.println(compteur);
                
                compteur += nombre3;
            
            }
            
            }
          
            
        } else if (nombre2 > nombre1) {
            
            int diff = nombre2 - nombre1;
            
            // Si le nombre3 est négatif
            if (nombre3 < 0){
            
                compteur = diff;
                
                while (compteur <= nombre1) {    
                
                System.out.println(compteur);
                
                compteur -= nombre3;
            
            }
                
            } else if (nombre3 > 0) {
            
                while (compteur <= diff) {
            
                System.out.println(compteur);
                
                compteur += nombre3;
            
            }
                
            }
            

            
        }
        
        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire

    // Vos fonctions doivent être AVANT ce commentaire
    
    /***
     * Cette fonction lis et retourne le prochain int entré par l'utilisateur
     */
    private static int readNextInt() {
        boolean valid;
        int res = 0;

        do {
            valid = true;
            try {
                res = Integer.parseInt(s.nextLine().strip().replaceAll("\n", ""));
            } catch (NumberFormatException e) {
                System.out.println("Entrée non reconnue, essayez encore !");
                valid = false;
            }
        } while (!valid);
        return res;
    }
    
    /***
     * Cette fonction lis et retourne le prochain double entré par l'utilisateur
     */
    private static double readNextDouble() {
        double res = Double.NaN;

        do {
            try {
                res = Double.parseDouble(s.nextLine().strip().replaceAll("\n", ""));
            } catch (NumberFormatException e) {
                System.out.println("Entrée non reconnue, essayez encore !");
            }
        } while (Double.isNaN(res));
        return res;
    }
    
    /***
     * Cette fonction lis et retourne le prochain char entré par l'utilisateur
     */
    private static char readNextChar() {
        return s.nextLine().charAt(0);
    }
    
    /***
     * Cette fonction lis et retourne la ligne entrée par l'utilisateur
     */
    private static String readNextString() {
        return s.nextLine();
    }
}
