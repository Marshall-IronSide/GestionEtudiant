import java.util.Scanner;

public class GestionEtudiant {
    public static void main(String[] args) {
        byte choix = 0;
        Cursus C = new Cursus();
        String nom, prenom;
        Scanner lecureClavier = new Scanner(System.in);
        do{
            System.out.println("1. Ajoute un etudiant ");
            System.out.println("2. Supprime un etudiant ");
            System.out.println("3. Affiche liste des etudiants ");
            System.out.println("4. Affiche un etudiant ");
            System.out.println("5. Modifie un etudiant ");
            System.out.println("6. Sortir ");
            System.out.println();
            System.out.print("Votre choix: ");
            choix = lecureClavier.nextByte();
            switch(choix){
                case 1: C.ajouteUnEtudiant();
                break;
                case 2:
                    System.out.println("Entrez le prénom de l'etudiant à suprimer");
                    prenom = lecureClavier.next();
                    System.out.println("Entrez le nom de l'Etudiant à suprimer");
                    nom = lecureClavier.next();
                    C.supprimeUnEtudiant(prenom, nom);
                break;
                case 3:
                    C.afficheLesEtudiant();
                break;
                case 4:
                    System.out.println("Entrez le prénom de l'etudiant");
                    prenom = lecureClavier.next();
                    System.out.println("Entrez le nom de l'Etudiant");
                    nom = lecureClavier.next();
                    C.rechercheUnEtudiant(prenom, nom);
                break;
                case 5:
                     System.out.println("Entrez le prénom de l'etudiant");
                     prenom = lecureClavier.next();
                     System.out.println("Entrez le nom de l'Etudiant");
                     nom = lecureClavier.next();
                     C.modifieUnEtudiant(prenom, nom);
                     break;
                     case 6: System.exit(0);
                     default: System.out.println("Option inconnu");
            }
        }while(choix != 6);
    }
}
