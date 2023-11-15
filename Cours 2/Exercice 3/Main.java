import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // 1. Demander à l'utilisateur le rayon d'un cercle
        
        System.out.println("Veuillez insérer le rayon d'un cercle ?");
        double rayon = readNextDouble();
        
        // 2. Demander à l'utilisateur d'introduire :

        //    "P" pour obtenir le périmètre 
            // 2 x 3.14 x rayon
        //    "A" pour obtenir l'aire
            // 3.14 x (rayon x rayon)
            
        System.out.println("Introduire \"P\" pour connaître le périmètre ou \"A\" pour l'aire ?");
        char choix = readNextChar();
            
        // 3. En fonction du choix, le programme calcule et affiche la valeur.
        
        switch(choix) {
            case 'P':
                System.out.println("Le périmètre est de " + (2 * 3.14 * rayon));
                break;
            case 'A':
                System.out.println("L'aire est de " + (3.14 * rayon * rayon));
                break;
            // 4. Pour toute autre lettre tapée, le programme affiche un message.
            default:
                System.out.println("Seul les valeurs P (majuscule) et A (majuscule) sont acceptés ");
                break;
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
