package fr.altereo.jmixgaugekotlin

import com.thoughtworks.gauge.Step
import com.thoughtworks.gauge.Table
import org.assertj.core.api.Assertions


class Fichier1StepImplementation {
    var date: String = ""

    @Step("Etant donné un dossier de référence <reference>")
    fun etantDonnéUnDossierDeRéférence(reference: String){

    }

    @Step("alors il n'y a pas de dernier contrôle")
    fun alorsIlNyAPasDeDernierContrôle(): Boolean {
        return true;
    }

    @Step("qui possède le contrôle <date>")
    fun quiPossèdeLeContrôle(date: String){
        this.date = date
    }

    @Step("alors le dernier contrôle de ce dossier est celui à la date <expectedDate>")
    fun alorsLeDernierContrôleDeCeDossierEstCeluiÀLaDate(expectedDate: String){
        Assertions.assertThat(expectedDate).isEqualTo(date)
    }

    @Step("Le statut initial est <statut>")
    fun leStatutInitialEst(statut: String){

    }

}
