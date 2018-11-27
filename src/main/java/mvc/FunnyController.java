package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/funny")
@Controller
public class FunnyController {

    @RequestMapping("/home")
    public String home(){
        return "funnyHome";
    }
}
