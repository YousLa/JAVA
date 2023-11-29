import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui :
        // 1. demande 2 entiers à l'utilisateur
        // 2. Affiche en retour le 1er nombre à la puissance du second.
            // Ex :2 & 5 = 2 exposant 5 = 32
        
        // Contraintes : 
            // Ne pas utiliser de mécanismes non-vu au cours.
            // Supporter des valeurs de résultats jusqu'à, au minimum, 2 exp 60.
            
        System.out.println("Veuillez entrer 2 entiers.");
        System.out.println("1er entier");
        int entier = readNextInt();
        System.out.println("2ème entier");
        int puissance = readNextInt();
        long total = entier;
        
        for(int i = 1; i < puissance; i++){
            total *= entier;
        }
        System.out.println(entier + " puissance " + puissance + " = " + total);
            
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
