package controller;

import dao.TaiKhoanDAO;
import models.MTaiKhoan;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CTaiKhoan {
    private static final Logger logger = Logger.getLogger(WebController.class);

    @Autowired
    TaiKhoanDAO TKdao;

    @RequestMapping(value = "/admin/getAllTK")
    public ModelAndView getAllTaiKhoanController() {
        logger.info("Lấy toàn bộ tài khoản");
        List<MTaiKhoan> listTK = TKdao.LayDanhSachTaIKhoan();
        return new ModelAndView("listTaiKhoan", "listTK", listTK);
    }

    @RequestMapping(value = "/admin/tst")
    public ModelAndView tstUI() {
        return new ModelAndView("testTemplate");
    }
}
