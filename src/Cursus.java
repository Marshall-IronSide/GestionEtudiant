import java.io.Serializable;
import java.util.HashMap;

public class Cursus implements Serializable {
    private HashMap<String,Etudiant> listeClasses;
    public Cursus(){
        listeClasses = new HashMap<String,Etudiant>();
    }
}
