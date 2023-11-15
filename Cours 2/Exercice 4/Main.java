import java.util.*;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Votre code doit être APRES de ce commentaire
        
        // Demander à l'utilisateur d'introduire une date entre 1900 et 2400
        // Sous la forme de 3 entiers (jour, mois et année - ex: 31 10 2015)
        // La date introduite doit être correcte PAS DE VERIFICATION
        
        System.out.println("Veuillez introduire le jour ?");
        int day = readNextInt();
        
        System.out.println("Veuillez introduire le mois ?");
        int month = readNextInt();
        
        System.out.println("Veuillez introduire l'année ?");
        int year = readNextInt();
        
        // Le programme affichera la date du lendemain
        // Attention aux années bissextiles
        
        // éléments à vérifier 
        // Février année bissextile ou non
        // Fin de mois : 
            // impair : janvier, mars, mai, juillet, aout, octobre, décembre 
            // pair : avril, juin, septembre, novembre
            // Février
        // Fin d'année
            // 31/12/year
            
            
            
            // Si la date est 31/12 on augmente l'année de 1 et reset le jour
            // et le mois à 1
            
            // Si le jour est 30 ou 31 on doit vérifier quel mois et en fonction 
            // rajouter 1 au jour ou 1 au mois
            if (year >= 1900 && year <= 2400) {
                if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
                System.out.println("C'est une année bissextile");
                // Si c'est une année bissextile février aura 29 jours, sinon 28
                if (month == 2 && day == 29) {
                    // On rajoute 1 au mois et on reset le jour à 1
                    day = 1;
                    month = 3;
                    System.out.println("Demain nous serons le "+ day + " " + month + " " + year);
                } 
            } else {
                if (month == 2 && day == 28) {
                    System.out.println("Ce n'est pas une année bissextile");
                    // On rajoute 1 au mois et on reset le jour à 1
                    month++;
                    day = 1;
                    System.out.println("Demain nous serons le "+ day + " " + month + " " + year);
                } else if (month == 12 && day == 31) {
                    month = 1;
                    day = 1;
                    year++;
                    System.out.println("Demain nous serons le "+ day + " " + month + " " + year);
                } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 && day == 31) {
                    // impair : janvier, mars, mai, juillet, aout, octobre, décembre
                    month++;
                    day = 1;
                    System.out.println("Demain nous serons le "+ day + " " + month + " " + year);
                } else if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) {
                    // pair : avril, juin, septembre, novembre
                    month++;
                    day = 1;
                    System.out.println("Demain nous serons le "+ day + " " + month + " " + year);
                }
            }
            // Votre code doit être AVANT de ce commentaire
        } else {
        System.out.println("Seule les dates comprises entre l'année 1900 et l'année 2400 sont acceptés");
        }
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
