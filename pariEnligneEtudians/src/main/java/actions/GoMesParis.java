package actions;

import modele.Pari;
import modele.Utilisateur;

import java.util.Collection;

public class GoMesParis extends Environnement{
    private Utilisateur utilisateur;
    private Collection<Pari> mesParis;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setMesParis(Collection<Pari> mesParis) {
        this.mesParis = mesParis;
    }

    public Collection<Pari> getMesParis() {
        return mesParis;
    }

    @Override
    public String execute() throws Exception {
        utilisateur= (Utilisateur) getSession().get("utilisateur");
        mesParis=getFacade().getMesParis(utilisateur.getLogin());
        return SUCCESS;
    }
}
