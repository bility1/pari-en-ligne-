package actions;

public class GoLogout extends Environnement {
    @Override
    public String execute() throws Exception {
        getFacade().deconnexion((String)getSession().get("login"));
        return super.execute();
    }
}
