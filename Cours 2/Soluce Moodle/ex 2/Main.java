import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // 1: demander à l'utilisateur de rayon
        System.out.println("Quel est le rayon du cercle ?");
        double rayon;
        rayon = readNextDouble();
        
        // 2: demander à l'utilisateur quel mode il veut
        System.out.println("Quel calcul voullez vous faire ? (aire: A; périmètre: P)");
        char choix;
        choix = readNextChar();
        
        // 3: calcul
            // si l'utilisateur a choisi a, calculer l'aire
            // si l'utilisateur a choisi p, calculer le périmètre
        double resultat = 0.0;
        boolean valide = false;        

        /*
        if(choix == 'A' || choix == 'a'){
            resultat = 3.14 * rayon * rayon;
            valide = true;
        } else if(choix == 'P' || choix == 'p'){
            resultat = 2 * 3.14 * rayon;
            valide = true;
        } else {
            System.out.println("Choix invalide !");
        }
        */
        
        switch(choix){
            case 'a':
            case 'A':
                resultat = 3.14 * rayon * rayon;
                valide = true;
                break;
            case 'p':
            case 'P':
                resultat = 2 * 3.14 * rayon;
                valide = true;
                break;
            default:
                System.out.println("Choix invalide !");
                break;
        }
        
        // 4: afficher la valeur
        if(valide){
            System.out.println("le résultat est " + resultat);
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
