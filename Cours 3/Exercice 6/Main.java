import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire

        // 1. Demander à l'utilisateur d'enter n nombre à virgule
        
        System.out.println("Veuillez entrer un nombre à virgule");
        
        double nombre = readNextDouble();
        
        // 2. Afficher : 
            // Le nombre arrondi vers le haut
            // nombre % 1 est le reste après la virgule
            double versLeHaut = nombre + 1 - nombre % 1;
            System.out.println("Le nombre arrondi vers le haut : " + versLeHaut);
            
            // Le nombre arrondi vers le bas
            System.out.println("Le nombre arrondi vers le bas : " + (nombre - nombre % 1));

            if (nombre % 1 > 0.5) {
                // Arrondir vers le haut si le reste après a virgule est supérieur à 0.5
                System.out.println("arrondi : " + versLeHaut);
            
            } else {
                
                 System.out.println("arrondi : " + (nombre - nombre % 1));
            }
        
                
                
                // Le nombre arrondi vers l'entier le plus proche
                
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
