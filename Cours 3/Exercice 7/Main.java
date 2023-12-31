import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui prend un nombre entre 0 et 127 
        // et construire sa représentation binaire
        
        // 1. Demander à l'utilisateur d'entrer un nombre entre 0 et 127:
        
        System.out.println("Veuillez entrer un nombre entre 0 et 127 pour avoir sa représentation binaire");
        
        int nombre = readNextInt();
        
        // On rajoute le résultat à chaque fois
        String resultat = "";
        
        // Vérifier si le nombre est bien entre 0 et 127 
            if (nombre > 127 || nombre < 0) {
                
                System.out.println("Nombre invalide");
            
        } else {
                
            // bit 1
            if(nombre % 2 == 1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 2
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 3
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 4
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 5
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 6
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            
            nombre /= 2;
            
            //bit 7
            if(nombre % 2 ==1) {
            resultat = "1" + resultat;
            } else {
            resultat = "0" + resultat;
            }
            System.out.println("Le nombre binaire est : " + resultat);
            
        }
        
        
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
