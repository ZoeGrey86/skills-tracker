package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsControllers {
    @GetMapping("/")
    public String String(){
        return "<html>" +
                "<p>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>" +
                " Java" +
                "</li>" +
                "<li>" +
                " JavaScript" +
                "</li>" +
                "<li>" +
                " Python" +
                "</li>" +
                "</ol>" +
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
                "<label for=\"language-select\">Choose a language:</label>\n" +
                "\n" +
                "<select name='firstLanguage' id=\"firstLanguage\">\n" +
                "    <option value=\"\">--My Favorite Language--</option>\n" +
                "    <option value=\"Java \">Java</option>\n" +
                "    <option value=\"javascript \">javascript</option>\n" +
                "    <option value=\"Python \">Python</option>\n" +
                "</select>" +
                "\n" +
                "<select name='secondLanguage' id=\"secondLanguage\">\n" +
                "    <option value=\"\">--My Second Favorite Language--</option>\n" +
                "    <option value=\"Java \">Java</option>\n" +
                "    <option value=\"javascript \">javascript</option>\n" +
                "    <option value=\"Python \">Python</option>\n" +
                "</select>" +
                "\n" +
                "<select name='thirdLanguage' id=\"thirdLanguage\">\n" +
                "    <option value=\"\">--My Third Favorite Language--</option>\n" +
                "    <option value=\"Java \">Java</option>\n" +
                "    <option value=\"javascript \">javascript</option>\n" +
                "    <option value=\"Python \">Python</option>\n" +
                "</select>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("results")
    public String results(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage){
        return "<html>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                firstLanguage +
                "</li>" +
                "<li>" +
                secondLanguage +
                "</li>" +
                "<li>" +
                thirdLanguage +
                "</li>" +
                "</ol>"+
                "<form action = '/'>" +
                "<input type='submit' value='Return Home'>" +
                "</form>"+
                "</html>";
    }
}



