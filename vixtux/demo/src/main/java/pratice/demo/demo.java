package pratice.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class demo {
    @RequestMapping("tut")
    public String tut() {
        return "Hello, World";
    }
    

}
