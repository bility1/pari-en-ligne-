package actions;

import modele.Match;
import modele.Utilisateur;

public class Parie extends Environnement{
    private long idMatch;
    private Match match;
    private Utilisateur utilisateur;

    public long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(long idMatch) {
        this.idMatch = idMatch;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String execute() throws Exception {
        utilisateur=(Utilisateur)getSession().get("utilisateur");
        match=getFacade().getMatch(idMatch);
        return SUCCESS;
    }
}
