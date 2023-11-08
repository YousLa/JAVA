import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // 1. Demander à l'utilisateur d'introduire sa note de fin d'année sur 20
        
        System.out.println("Veuillez introduire votre note de fin d'année (note sur 20).");
        // int note = readNextInt();
        double note = readNextDouble();
        
        // 2. Vérifier que la note est entre 0 et 20
        
        if (note >= 0.0 && note <= 20.0){
            if (note < 10.0){
                // 3. En fonction de la note afficher le grade
                System.out.println("Aucun grade");
            } else if (note < 12.0) {
                System.out.println("Réussi");
            } else if (note < 14.0) {
                System.out.println("Satisfaction");
            } else if (note < 16.0) {
                System.out.println("Distinction");  
            } else if (note < 18.0) {
                System.out.println("Grande distinction"); 
            } else {
                System.out.println("La plus grand distinction"); 
            }
        } else { // La note n'estp pas valide
            System.out.println("La note n'est pas valide");
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
