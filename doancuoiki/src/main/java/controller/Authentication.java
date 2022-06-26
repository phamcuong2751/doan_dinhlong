package controller;

import dao.AuthenticationDAO;
import models.MUsers;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Authentication {
    private static final Logger logger = Logger.getLogger(WebController.class);

    final
    AuthenticationDAO AuthDAO;

    public Authentication(AuthenticationDAO AuthDAO) {
        this.AuthDAO = AuthDAO;
    }

    @RequestMapping(value = "/login/allUsers", method = RequestMethod.GET)
    public ModelAndView getAllUserController() {
        logger.info("Get all users!");
        List<MUsers> listUsers = AuthDAO.getAllListUsers();
        return new ModelAndView("authentication/login", "listUsers", listUsers);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPageController() {
        logger.info("get login pages!");
        return new ModelAndView("authentication/login");
    }

    /**
     * @function Function get login information and check role to show view for each user level
     * @param username
     * @param password
     * @method POST
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView getLoginInfoController(String username, String password) {
        logger.info("METHOD POST get login information!");
        try {
            MUsers user = new MUsers();
            user = AuthDAO.FindUserByUsername(username);

            if (user.getUser_level() == 1) {
                return new ModelAndView("redirect:home.html");
            }else {
                return new ModelAndView("/testTemplate");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ModelAndView("/common/404");
        }
    }
}
