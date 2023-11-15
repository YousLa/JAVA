import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        System.out.println("Quel est le jour ? ");
        int jour = readNextInt();
        
        System.out.println("Quel est le mois ? ");
        int mois = readNextInt();
        
        System.out.println("Quel est l'année ? ");
        int annee = readNextInt();
        
        jour++;
        
        // est ce que jour > la taille du moi actuel
        // si oui, jour = 1; ajouter 1 à moi
        switch(mois){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(jour > 31){
                    jour = 1;
                    mois ++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(jour > 30){
                    jour = 1;
                    mois ++;
                }
                break;
            default: // pour février
                if(annee % 4 == 0 && annee % 100 != 0 && annee % 400 == 0){ // annee bi
                    if(jour > 29){
                        jour = 1;
                        mois ++;
                    }
                } else {
                    if(jour > 28){
                        jour = 1;
                        mois ++;
                    }
                }
                break;
        }
        
        // est ce que moi > 12
        // moi = 1; ajouter 1 à année
        if(mois > 12){
            mois = 1;
            annee++;
        }
        
        System.out.println("Le jour d'après est le " + jour + "/" + mois + "/" + annee);
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
