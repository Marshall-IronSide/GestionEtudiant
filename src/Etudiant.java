import java.io.Serializable;
import java.util.Scanner;

public class Etudiant implements Serializable {
    private String nom, prenom;
    private double []notes;
    private double moyenne;

    public Etudiant() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez le nom de l'etudiant : ");
        nom = lectureClavier.next();
        System.out.print("Entrez le prenom de l'etudiant : ");
        prenom = lectureClavier.next();
        System.out.print("Combien de notes pour l'etudiant : ");
        System.out.println(nom + " " + prenom);
        int nombre = lectureClavier.nextInt();
        notes = new double[nombre];
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note No"+(i+1)+" : ");
            notes[i] = lectureClavier.nextDouble();
        }
        moyenne = calculMoyenne();
    }

    public Etudiant(String p, String n) {
        this.nom = n;
        this.prenom = p;
        System.out.print("Combien de notes pour l'etudiant : ");
        System.out.println(nom + " " + prenom);
        Scanner lectureClavier = new Scanner(System.in);
        int nombre = lectureClavier.nextInt();
        notes = new double[nombre];
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note No"+(i+1)+" : ");
            notes[i] = lectureClavier.nextDouble();
        }
        moyenne = calculMoyenne();
    }

    private double calculMoyenne() {
        double somme = 0.0;
        for (double valeurNotes : notes) {
            somme += valeurNotes;
        }
        return somme/notes.length;
    }
    public void afficheUnEtudiant() {
        System.out.println("Les notes de l'étudiant "+nom+" "+prenom+" sont: " );
        for (double valeurNotes : notes) {
            System.out.println(" "+valeurNotes);
        }
        System.out.println();
        System.out.println("sa moyenne est : " + moyenne);
    }

    public String quelNom() {
        return nom;
    }
    public String quelPrenom() {
        return prenom;
    }
    public double quelMoyenne() {
        return moyenne;
    }

}
