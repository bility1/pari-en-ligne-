package actions;

import facade.exceptions.MatchClosException;
import facade.exceptions.ResultatImpossibleException;
import modele.Match;
import modele.Pari;
import modele.Utilisateur;

public class ValiderPari extends Environnement{
    private long idMatch;
    private String vainqueur;
    private double mise;
    private Pari nvPari;
    private Utilisateur utilisateur;
    private Match unMatch;
    private long idPari;

    public long getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(long idMatch) {
        this.idMatch = idMatch;
    }

    public String getVainqueur() {
        return vainqueur;
    }

    public void setVainqueur(String vainqueur) {
        this.vainqueur = vainqueur;
    }

    public double getMise() {
        return mise;
    }

    public void setMise(double mise) {
        this.mise = mise;
    }

    public Pari getNvPari() {
        return nvPari;
    }

    public void setNvPari(Pari nvPari) {
        this.nvPari = nvPari;
    }

    public Utilisateur getUtilisateur() {
        utilisateur=(Utilisateur)getSession().get("utilisateur");
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Match getUnMatch() {
        unMatch=getFacade().getMatch(idMatch);
        return unMatch;
    }

    public void setUnMatch(Match unMatch) {
        this.unMatch = unMatch;
    }

    @Override
    public String execute() {
        try {
            utilisateur= (Utilisateur) getSession().get("utilisateur");
            idPari=getFacade().parier(utilisateur.getLogin(),idMatch,vainqueur,mise);
            nvPari=getFacade().getPari(idPari);
        } catch (MatchClosException e) {
            e.printStackTrace();
            return INPUT;
        } catch (ResultatImpossibleException e) {
            e.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
}
