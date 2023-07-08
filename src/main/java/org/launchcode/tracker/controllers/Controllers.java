package org.launchcode.tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class Controllers {
    @GetMapping("")
    public String String(){
        return "<html>" +
                "<p>" +
                "<h1>" +
                "Welcome" +
                "</h1>" +
                "<h2>" +
                "" +
                "</h2>" +
                "</p>" +
                "<form action ='form'>" +
                "<input type='submit' value='GoTo Form'>" +
                "</form>"+
                "</html>";
    }

    @GetMapping("form")
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action='results'>" + // submit a request to hello
                "<label for=\"name\">What is your name?:</label>\n"+
                "<input type='text' name='name' id=\"name\">" +
                "<label for=\"email\">What is your email?:</label>\n"+
                "<input type='text' name='email' id=\"email\">" +
                "<label for=\"password\">What is your password?:</label>\n"+
                "<input type='text' name='password' id=\"password\">" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("results")
    public String results(@RequestParam String name, String email, String password){
        return "<html>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                email +
                "</li>" +
                "<li>" +
                password +
                "</li>" +
                "</ol>"+
                "<form action = '/'>" +
                "<input type='submit' value='Return Home'>" +
                "</form>"+
                "</html>";
    }
}



