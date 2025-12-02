import java.io.Serializable;
import java.util.HashMap;

public class Cursus implements Serializable {
    private HashMap<String,Etudiant> listeClasses;
    public Cursus(){
        listeClasses = new HashMap<String,Etudiant>();
    }
    public String CreerUneCle (Etudiant e){
        String tmp;
        tmp =(e.quelPrenom()).charAt(0) + e.quelNom();
        tmp.toUpperCase();
        return tmp;
    }
    public String CreerUneCle (String p, String s){
        String tmp;
        tmp = p.charAt(0)+s;
        tmp.toUpperCase();
        return tmp;
    }
    public void ajouteUnEtudiant(){
        Etudiant e = new Etudiant();
        String cle = CreerUneCle(e);
        Etudiant nouveau = (Etudiant) listeClasses.get(cle);
        if(nouveau == null){
            listeClasses.put(cle,e);
        }

    }
    public void  rechercheUnEtudiant(String p, String n){
        String cle = CreerUneCle(p,n);
        Etudiant e = (Etudiant) listeClasses.get(cle);
        if(e != null){
            e.afficheUnEtudiant();
        }else {
            System.out.println(p+" "+n+" inconnu");
        }
    }
    public void supprimeUnEtudiant(String p, String n){
        String cle = CreerUneCle(p,n);
        Etudiant e = (Etudiant) listeClasses.get(cle);
        if(e != null){
            listeClasses.remove(cle);
            System.out.println(p+" "+n+" supprime");
        }else {
            System.out.println(p+" "+n+" inconnu");
        }
    }
}
