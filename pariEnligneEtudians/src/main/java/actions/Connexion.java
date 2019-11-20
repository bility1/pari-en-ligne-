package actions;

import facade.exceptions.InformationsSaisiesIncoherentesException;
import facade.exceptions.UtilisateurDejaConnecteException;
import modele.Utilisateur;

public class Connexion extends Environnement {
    private String login;
    private String mdp;

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String execute() {
        try {
            Utilisateur utilisateur = getFacade().connexion(login, mdp);

            getSession().put("utilisateur",utilisateur);

        } catch (UtilisateurDejaConnecteException e) {
            addFieldError("login", getText("Déja Connecter"));
            return INPUT;
        } catch (InformationsSaisiesIncoherentesException e) {
            e.printStackTrace();
            return INPUT;
        }
        return SUCCESS;
    }
}
