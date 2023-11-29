import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Ecrire un programme qui :
        // 1. Demander des nombres entiers à l'utilisateur.
        // 2. Dès que l'utilisateur entre un nombre plus grand ou égal 
        //    au cube du premier nombre, afficher la différence entre
        //    la somme de tous les nombres entrés et le dernier.
        
        // 1.
        System.out.println("Veuillez entrer des nombres entiers");
        
        int entier = readNextInt();
        int cube = entier;
        // CUBE
        for(int i = 1; i < 3; i ++){
            cube *= entier;
        }
        System.out.println("Le Cube de "+ entier + " est : " + cube);
        
        // 2.        
        int entierBis = readNextInt();
        int somme = entier + entierBis;
        System.out.println(somme);
        
        while(entierBis < cube) {
            System.out.println("Veuillez entrer des nombres entiers");
            entierBis = readNextInt();
            somme += entierBis;
            System.out.println(somme);
        }
        
        System.out.println("La différence entre la somme des nombres et le dernier nombres entrez est de : " + (somme - entierBis));
        
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
