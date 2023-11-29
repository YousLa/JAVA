import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        System.out.println("Quel est le début ?");
        int debut = readNextInt();
        System.out.println("Quel est le fin ?");
        int fin = readNextInt();
        System.out.println("Quel est l'interval ?");
        int interval = readNextInt();
        
        if((fin > debut && interval < 0) || (debut > fin && interval > 0) || interval == 0) {
        
            System.out.println("interval infini !");
            System.out.println("fin du programme.");
        
        } else {
            int nombre = debut;
            if (interval > 0) {
                while (nombre <= fin) {
                    System.out.println(nombre);
                    nombre += interval;
                }     
            } else {
                while (nombre >= fin) {
                    System.out.println(nombre);
                    nombre += interval;
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
