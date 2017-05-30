/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5ihm;

import java.time.LocalDate;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Pierre
 */
public class Seance {
    SimpleStringProperty matiere;
    SimpleStringProperty nature;
    SimpleObjectProperty<LocalDate> date;
    SimpleStringProperty salle;
    SimpleStringProperty enseignant;

    public SimpleStringProperty getMatiere() {
        return matiere;
    }

    public void setMatiere(SimpleStringProperty matiere) {
        this.matiere = matiere;
    }

    public SimpleStringProperty getNature() {
        return nature;
    }

    public void setNature(SimpleStringProperty nature) {
        this.nature = nature;
    }

    public SimpleObjectProperty<LocalDate> getDate() {
        return date;
    }

    public void setDate(SimpleObjectProperty<LocalDate> date) {
        this.date = date;
    }

    public SimpleStringProperty getSalle() {
        return salle;
    }

    public void setSalle(SimpleStringProperty salle) {
        this.salle = salle;
    }

    public SimpleStringProperty getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(SimpleStringProperty enseignant) {
        this.enseignant = enseignant;
    }
    
    
}
