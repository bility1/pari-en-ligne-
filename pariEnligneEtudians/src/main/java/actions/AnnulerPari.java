package actions;

import facade.exceptions.OperationNonAuthoriseeException;
import modele.Pari;
import modele.Utilisateur;

import java.util.Collection;

public class AnnulerPari extends Environnement {
    private long idPari;
    private Pari lePari;
    private Utilisateur utilisateur;
    private Collection<Pari> mesParis;

    public Pari getLePari() {
        return lePari;
    }

    public void setLePari(Pari lePari) {
        this.lePari = lePari;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Collection<Pari> getMesParis() {
        return mesParis;
    }

    public void setMesParis(Collection<Pari> mesParis) {
        this.mesParis = mesParis;
    }

    public void setIdPari(long idPari) {
        this.idPari = idPari;
    }

    public long getIdPari() {
        return idPari;
    }

    @Override
    public String execute() {
        try {
            utilisateur = (Utilisateur) getSession().get("utilisateur");
            lePari = getFacade().getPari(idPari);
            
            getFacade().annulerPari(utilisateur.getLogin(),idPari);
        } catch (OperationNonAuthoriseeException e) {
            addFieldError("mesParis", getText("Votre Parie est annuler."));
            return INPUT;
        }
        return SUCCESS;
    }
}
