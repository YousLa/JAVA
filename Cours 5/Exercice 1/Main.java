import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui:
        // 1. Demande à l'utilisateur 10 nombres  
        // 2. Après que l'utilisateur les aie entrés, afficher le plus grand.
        // 3. Avant chaque entrée, dire à l'utilisateur il en est à combien.
        
        System.out.println("Veuillez entrer 10 nombres");
        System.out.println("Vous êtes à la position 1");
        int nombre = readNextInt();
        int max = nombre;
        for (int i = 2; i <= 10; i++) {
            System.out.println("Vous êtes à la position " + i);
            nombre = readNextInt();
            if (nombre > max) {
            max = nombre;
            }
        }
        
        System.out.println("Le plus grand nombre est = " + max);
        
        
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
