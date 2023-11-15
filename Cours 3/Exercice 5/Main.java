import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire

        // 1. Demander à l'utilisateur d'enter un prix en centimes
        
        System.out.println("Veuillez entrer le prix en centimes");
        
        int centimes = readNextInt();
        
        boolean estPositif = centimes > 0;
        
        if (!estPositif) {
        // Si le nombre est négatif en le multipliant par -1 on le transforme en nombre positif
        centimes *= -1;
    }
        
        // 2. Arrondir les centimes en euros
        
        int virgule = centimes % 100;
        
        // 3. Afficher le prix en euros arrondi.
        
        if (virgule > 50) {
            // On arrondi vers le haut
            centimes += 100 - virgule;
            System.out.println("Le prix est " + centimes + " euro cents");
        } else {
            // On arrondi vers le bas
            centimes -= virgule;
            System.out.println("Le prix est " + centimes + " euro cents");
        }
        
        // Si le nombre était en entré négatif et qu'on l'as transformé en positif pour le calcul on doit le retransfromer en négatif
        if (!estPositif) {
            // Multiplier un nombre positif par -1 le rend négatif
            centimes *= -1;
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
