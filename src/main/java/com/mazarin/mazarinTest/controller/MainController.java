package com.mazarin.mazarinTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hp on 1/20/2017.
 */


@Controller
public class MainController {

    @RequestMapping(value = { "/","welcome" }, method = RequestMethod.GET)
    public ModelAndView defaultPage() {

        ModelAndView model = new ModelAndView();
        model.setViewName("welcome");
        return model;

    }

}
