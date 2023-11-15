import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // 1: demander la note
        System.out.println("Qeulle est la note ?");
        double note;
        note = readNextDouble();
        
        // 2: vérifier que la note est valide
        if(note >= 0 && note <= 20) { // la note est valide
            // 3: en fonction de la note, affichier la bon grade
            if(note < 10) { // 0 -> 10
                System.out.println("Aucun grade !");                
            } else if (note < 12) { // 10 -> 12
                System.out.println("grade réussi !");     
            } else if (note < 14) {
                System.out.println("grade Satisfaction !");      
            } else if (note < 16) {
                System.out.println("grade Distinction !");
            } else if (note < 18) {
                System.out.println("grade Grande Distinction !"); 
            } else {
                System.out.println("grade la plus grande distinction avec les felicitations !"); 
            }
        } else { // la note n'est pas valide !
            System.out.println("La note n'est pas valide; elle doit etre entre 0 et 20");
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
