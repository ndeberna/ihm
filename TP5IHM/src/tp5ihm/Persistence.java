/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5ihm;

import java.io.File;
import javafx.collections.ObservableList;

/**
 *
 * @author Nathan
 */
public class Persistence {
    private File fichier;

    public Persistence(String unNom) {
        this.fichier = new File(unNom);
    }
    
    public void sauve(ObservableList<Seance> uneListe){
        this.fichier = (File) uneListe;
    }
    
    public ObservableList<Seance> restaure(){
        return (ObservableList<Seance>) this.fichier;
    }
}
