import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire

        // Ecrire un programme qui :
        // 1. Demande 5 entiers positifs à l'utilisateur.
        // 2. Le programme affiche :
            // La moyenne
            // La somme 
        // Contrainte : Ecrire deux variantes du programme => while - for
        
        // FOR
        
        System.out.println("Veuillez entrer 5 entiers positifs");
        System.out.println("1er");
        
        // Pour calcruler la moyenne on addidtionne les nombres et le divise 
        // par la quantité de nombre. 
        
        int entier = readNextInt();
        int somme = entier;
        for(int i = 2; i <= 5; i++) {
        System.out.println(i + "ème");
        entier = readNextInt();
        somme += entier;
        }
        System.out.println("La somme des 5 entiers positifs est : " + somme);
        System.out.println("La moyenne des 5 entiers positifs est : " + (somme / 5));
        
        
        // WHILE 
        
        System.out.println("Veuillez entrer 5 entiers positifs");
        System.out.println("1er");
        
        int entier2 = readNextInt();
        int somme2 = entier2;
        
        int j = 2;
        
        while(j <= 5) {
        System.out.println(j + "ème");
        entier2 = readNextInt();
        somme2 += entier2;
        j++;
        } 
        
        System.out.println("La somme des 5 entiers positifs est : " + somme2);
        System.out.println("La moyenne des 5 entiers positifs est : " + (somme2 / 5));
        
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
