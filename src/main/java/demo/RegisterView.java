package demo;

import entity.User;
import model.Model;

import javax.faces.bean.ManagedBean;
import java.util.logging.Logger;

@ManagedBean
public class RegisterView {

    private static final Logger LOGGER = Logger.getLogger(RegisterView.class.getName());

    private User user = new User();

    public String doSubmit() {
        Model model = new Model();
        boolean result = model.insertUser(user);
        if (result) {
            return "home";
        } else {
            return "register";
        }

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
