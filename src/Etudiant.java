import java.util.Scanner;

public class Etudiant {
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
    }
}
