package demo;

import entity.User;
import model.Model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.jws.soap.SOAPBinding;
import java.util.logging.Logger;

@ManagedBean
public class LoginView {
    private static final Logger LOGGER = Logger.getLogger(LoginView.class.getName());

    private User user = new User();

    public String doSubmit() {
        Model model = new Model();
        User us = model.getOneUser(user.getUsername(), user.getPassword());
        if (us == null) {
            FacesContext.getCurrentInstance().addMessage("loginForm:pass", new FacesMessage("Username or pass incorrect", "Username or pass incorrect"));
            return "login";
        } else {
            return "home";
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
