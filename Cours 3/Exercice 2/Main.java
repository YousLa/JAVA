import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Réécrire les calculs suivants sans les parenthèses superflues.
        // ((1+2)-3)*(4/5)
        System.out.println("Non simplifiée (1) : " + ((1+2)-3)*(4/5));
        System.out.println("Simplifiée (1) : " +(1+2-3)*4/5);
        
        // ((((1 * 2) * 3) * 4) *5)
        System.out.println("Non simplifiée (2) : " + ((((1 * 2) * 3) * 4) *5));        
        System.out.println("Simplifiée (2) : " + 1 * 2 * 3 * 4 *5);
        
        //(1 * (2 * (3 * (4 * 5)))) 
        System.out.println("Non simplifiée (3) : " + (1 * (2 * (3 * (4 * 5)))) );        
        System.out.println("Simplifiée (3) : " + 1 * 2 * 3 * 4 * 5 );
        
        //(1 % (2 + 3))
        System.out.println("Non simplifiée (4) : " + (1 % (2 + 3)));        
        System.out.println("Simplifiée (4) : " + 1 % (2 + 3) );
        
        // 1/((2 * (3)) % 4)
        System.out.println("Non simplifiée (5) : " + 1/((2 * (3)) % 4));        
        System.out.println("Simplifiée (5) : " + 1/(2 * 3 % 4));
        
        // (1 * 2) + (3 /(4 - 5))
        System.out.println("Non simplifiée (6) : " + ((1 * 2) + (3 /(4 - 5))));        
        System.out.println("Simplifiée (6) : " + (1 * 2 + 3 /(4 - 5)));
        
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
