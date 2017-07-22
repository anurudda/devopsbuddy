package org.anurudda.devopsbuddy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dilan on 7/22/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
