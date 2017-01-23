package com.zach;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Zach on 1/23/17.
 */
@Controller
public class HappyOurController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
        public String index() {

            return "index";
        }

}
