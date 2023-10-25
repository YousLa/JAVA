import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) { 
    // Votre code doit être APRES de ce commentaire

    // Un commerçant vends trois produits dont les prix unitaire sont les suiants avec les taux de TVA associés:
    // 10€ => TVA: 6%
    // 15€ => TVA: 6%
    // 25€ => TVA : 21%
    
    // Demander à l'utilisateur d'introduire les quantités achetées pour chacun des produits. 
    // Le programme calculera ensuite le montant à payer TVA comprise :
    System.out.println("Combien de banane voulez-vous acheter ?");
    int quantiteBanane = readNextInt();
    
    System.out.println("Combien de pomme voulez-vous acheter ?");
    int quantitePomme = readNextInt();
    
    System.out.println("Combien de poire voulez-vous acheter ?");
    int quantitePoire = readNextInt();
    
    // Produits 1 : banane vaut 10€
    int totalBanane = quantiteBanane * 10;

    // Produits 2 : pomme vaut 15€
    int totalPomme = quantitePomme * 15;
    
    // Produits 3 : poire vaut 25€
    int totalPoire = quantitePoire * 25;
    
    
    // Calculer la TVA en fonction du produit
    double totalProduit1 = totalBanane * 1.06;
    double totalProduit2 = totalPomme * 1.06;
    double totalProduit3 = totalPoire * 1.21;
    
    // Total TVAC
    double totalTVAC = totalProduit1 + totalProduit2 + totalProduit3;
    // Créer un if pour la tva
    if(totalTVAC > 25000.0) {
        double ristourne = totalTVAC * 0.04;
        double totalRistourne = totalTVAC - ristourne;
        // Afficher le total à payer insérez par l'utilisateur
        System.out.println("Le total à payer TVA comprise est de : " + totalRistourne + "€. Vous bénéficiez d'une ristourne de : " + ristourne + " €");
    } else {
        // Afficher le total à payer insérez par l'utilisateur
        System.out.println("Le total à payer TVA Comprise est de : " + totalTVAC + "€");
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
