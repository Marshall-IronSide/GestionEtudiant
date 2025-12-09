import java.io.*;

public class FichierEtudiant {
    private ObjectOutputStream fWo;
    private ObjectInputStream fRo;
    private char mode;
    private String nomDuFichier = "D:\\2nd year stuff\\Java\\GestionEtudiant\\src\\data\\Cursus.dat";
    public void ouvrir(String s) throws IOException {
        mode = (s.toUpperCase()).charAt(0);
        if (mode == 'R' || mode == 'L') {
            fRo = new ObjectInputStream(new FileInputStream(nomDuFichier));
        } else if (mode == 'W' || mode == 'E') {
            fWo = new ObjectOutputStream(new FileOutputStream(nomDuFichier));
        }
    }
    public void fermer() throws IOException {
        if (mode == 'R' || mode == 'L') {
            fRo.close();
        } else if (mode == 'W' || mode == 'E') {
            fWo.close();
        }
    }
    public Cursus lire() throws IOException, ClassNotFoundException {
        Cursus tmp= (Cursus) fRo.readObject();
        return tmp;
    }
    public void ecrire(Cursus tmp) throws IOException, ClassNotFoundException {
        if (tmp != null) {
            fWo.writeObject(tmp);
        }
    }
}
