import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui :
        // 1. Demande un nombre entier à l'utilisateur.
        // 2. Affiche en retour la somme des nombres entiers entre zéro et l'input.
        
        // Attention ! Le nombre entré peut être négatif et valide !
        
        System.out.println("Veuillez entrer un nombre entier");
        
        int depart = readNextInt();
        int somme = 0;
        
        if(depart > 0) {
            // Cas entiers positifs supérieur à 0
            for(int i = depart; i > 0; i--) {
                somme += i;
            }
        } else if (depart < 0) {
            // Cas entiers négatifs
            for(int i = depart; i < 0; i++) {
                somme += i;
            }
        }
        
        System.out.println("La somme est : " + somme);
        
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
