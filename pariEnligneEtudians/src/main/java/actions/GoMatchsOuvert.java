package actions;

import modele.Match;
import modele.Utilisateur;

import java.util.Collection;

public class GoMatchsOuvert extends Environnement {
    private Collection<Match> listeMatchsOuverts;

    private Utilisateur utilisateur;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Collection<Match> getListeMatchsOuverts() {
        return listeMatchsOuverts;
    }

    public void setListeMatchsOuverts(Collection<Match> listeMatchsOuverts) {
        this.listeMatchsOuverts = listeMatchsOuverts;
    }


    @Override
    public String execute() throws Exception {
        utilisateur= (Utilisateur) getSession().get("utilisateur");
        listeMatchsOuverts=getFacade().getMatchsPasCommences();

         return SUCCESS;
    }
}
