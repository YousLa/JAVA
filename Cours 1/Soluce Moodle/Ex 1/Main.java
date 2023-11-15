import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        final double produit1 = 10;
        final double produit2 = 15;
        final double produit3 = 25;
        
        final double tva1 = 0.06;
        final double tva2 = 0.06;
        final double tva3 = 0.21;
        
        System.out.println("Quantité produit 1 :");
        int quantite1 = readNextInt();
        
        System.out.println("Quantité produit 2 :");
        int quantite2 = readNextInt();
        
        System.out.println("Quantité produit 3 :");
        int quantite3 = readNextInt();
        
        double total1 = produit1 * (1 + tva1) * quantite1;
        double total2 = (produit2 + produit2 * tva2) * quantite2;
        double total3 = produit3 * (1 + tva3) * quantite3;
        
        double total = total1 + total2 + total3;
        
        if(total > 25000) {
            total -= total * 0.04;
            // total *= 0.96;
        }
        
        System.out.println("Le montant à payer est de : " + total);
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
