/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import services.SSLEmail;
import dao.NhanVienDAO;
import models.CNhanVien;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
@Controller
public class WebController {

    private static final Logger logger = Logger.getLogger(WebController.class);

    @Autowired
    NhanVienDAO dao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView Index_UI() {
        return new ModelAndView("authentication/login");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home_UI() {
        return new ModelAndView("homeProduction");
    }
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView SeachNhanVien(String manv) {
        logger.info("Tìm kiếm nhân viên theo mã nhân viên");
        CNhanVien nv = dao.TimKiem(manv);
        
        List<CNhanVien> listNV = new ArrayList();
        listNV.add(nv);
        return new ModelAndView("listNhanVien", "list", listNV);
    }
    @RequestMapping(value = "/sendEmail", method = RequestMethod.GET)
    public ModelAndView SendEmail() {
        SSLEmail email = new SSLEmail();
        email.sendEmail();
        return new ModelAndView("SendEmail");
    }
}
