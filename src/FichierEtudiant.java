import java.io.*;

public class FichierEtudiant {
    private ObjectOutputStream fWo;
    private ObjectInputStream fRo;
    private char mode;
    private String nomDuFichier = "data/Cursus.dat";
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
}
