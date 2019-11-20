package actions;

import com.opensymphony.xwork2.ActionSupport;
import facade.FacadeParis;
import facade.FacadeParisStaticImpl;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class Environnement extends ActionSupport implements ApplicationAware, SessionAware {
    private FacadeParis facade;
    private Map<String, Object> session;

    public FacadeParis getFacade() {
        return facade;
    }



    public Map<String, Object> getSession(){
        return session;
    }


    public void setFacade(FacadeParis facade) {
        this.facade = facade;
    }


    @Override
    public void setApplication(Map<String, Object> map) {
       facade = (FacadeParis) map.get("modele");
        if (facade == null){
            facade = new FacadeParisStaticImpl();
            map.put("modele",facade);
        }
    }

    @Override
    public void setSession(Map<String, Object> map) {
       session = map;
    }
}
