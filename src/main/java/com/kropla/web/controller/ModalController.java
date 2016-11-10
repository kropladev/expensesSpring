package com.kropla.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kropla on 09.11.16.
 */
@Controller
public class ModalController {

    @RequestMapping(value = "/modal", method = RequestMethod.GET)
    public String modalWindowTest(){
        return "modal";

    }
}
