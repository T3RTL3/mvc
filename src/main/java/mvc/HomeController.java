package mvc;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/")
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloWorld";

    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "processForm";
    }
    @RequestMapping("/secondProcessForm")
    public String secondProcessForm(@RequestParam("studentName") String theName, Model model){
        theName.toUpperCase();
        String result = "Yo! Nice to mee to "+ theName;
        model.addAttribute("message", result);
        return "processForm";
    }
}
