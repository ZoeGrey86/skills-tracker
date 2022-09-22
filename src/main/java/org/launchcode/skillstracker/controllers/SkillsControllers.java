package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsControllers {
    @GetMapping("SkillsTracker")
    public String SkillsTracker(){
        return "<html>" +
                "<body>" +
                "<form action='hello'>" + // submit a request to hello
                "<label for=\"name\">What is your name?:</label>\n"+
                "<input type='text' name='name' id=\"name\">" +
                "<label for=\"language-select\">Choose a language:</label>\n" +
                "\n" +
                "<select name='language' id=\"language-select\">\n" +
                "    <option value=\"\">--My Favorite Language--</option>\n" +
                "    <option value=\"Java \">Java</option>\n" +
                "    <option value=\"javascript \">javascript</option>\n" +
                "    <option value=\"Python \">Python</option>\n" +
                "</select>" +
                "\n" +
                "<select name='language' id=\"language-select\">\n" +
                "    <option value=\"\">--My Second Favorite Language--</option>\n" +
                "    <option value=\"Java \">Java</option>\n" +
                "    <option value=\"javascript \">javascript</option>\n" +
                "    <option value=\"Python \">Python</option>\n" +
                "</select>" +
                "\n" +
                "<select name='language' id=\"language-select\">\n" +
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
}
