/*
 * OUTRIGHT MENTAL CONFIDENTIAL
 *
 * [2012] - [2013] Outright Mental Incorporated
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is the property of Outright Mental Incorporated and subject to the terms and conditions defined in file 'LICENSE.txt', which is part of this source code package.
 */
package com.outrightmental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Nick
 * Date: 1/9/13
 * Time: 1:32 PM
 */
@Controller
@RequestMapping("/movie")
public class MovieController {
    //DI via Spring
    String message;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String name, ModelMap model) {

        model.addAttribute("movie", name);
        model.addAttribute("message", this.message);

        //return to jsp page, configured in mvc-mvc-dispatcher-servlet.xml, view resolver
        return "list";

    }

    public void setMessage(String message) {
        this.message = message;
    }
}
