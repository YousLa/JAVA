import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.println("Entrez le nombre: ");
        
        int nombre = readNextInt();
        int entree = nombre;
        
        String resultat = "";
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        nombre /= 2;
        
        if (nombre % 2 == 1) {
            resultat = "1" + resultat;
        } else {
            resultat = "0" + resultat;
        }
        
        System.out.println("Le nombre " + entree + " est " + resultat + " en binaire");

        // Votre code doit être AVANT de ce commentaire
    }
    // Vos fonctions doivent être APRES ce commentaire

    // Vos fonctions doivent être AVANT ce commentaire
    
    /***
     * Cette fonction lis et retourne le prochain int entré par l'utilisateur
     */
    private static int readNextInt() {
        int res = -1;

        do {
            try {
                res = Integer.parseInt(s.nextLine().strip().replaceAll("\n", ""));
            } catch (NumberFormatException e) {
                System.out.println("Entrée non reconnue, essayez encore !");
            }
        } while (res == -1);
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
