import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire

        // Ecrire un programme qui prend un entier en entrée et affiche en retour
        // si le nombre est sublime.
        
        // diviseurs de 10 = 5 et 2 car 10 est divisible par 5, 2 et 1 sans faire de virgule
        // A est diviseur de B si B % A == 0
        // A est parfait si l'addition de tous ses diviseur == A
        // Ex : diviseurs de 10 == 5, 2 et 1 => 5 + 2 + 1= 8 donc 10 n'est pas un nombre parfait
        // 6 est un nombre parfait => diviseurs de 6 = 1, 2 et 3 => 1 + 2 + 3 = 6 
        // 12 est sublime => diviseurs de 12 => 1 , 2 , 3 , 4 , 6 
        
        // 1. Demander à l'utilisateur d'enter un nombre entier
        
        System.out.println("Veuillez entrer un nombre entier");
        int nombre = readNextInt();
        
        // 2. Trouver tous les diviseurs d'un nombre
        
        int compteur = 1;
        
        String resultat ="";
        
        do {
            if (nombre % compteur == 0) {
                // Si nombre % compteur == 0 alors il est diviseur de nombre
                resultat = resultat + " " + compteur + " ";
            }
            compteur++;
           
        } while (compteur < nombre);
        System.out.println("Les diviseurs de " + nombre + " sont" + resultat);
        
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
