package controller;

import model.AdDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AdDetailsService;

@RestController
//@org.springframework.stereotype.AdController
@Controller
public class AdController {

    @Autowired
    AdDetailsService adService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/createAd")
    public boolean createAd(@RequestBody AdDetail adDetail){
        return adService.saveAdDetailsToMap(adDetail);
    }

    @GetMapping("/saveToDB")
    public boolean saveToDB(){
        return adService.saveAdDetailsToDB();
    }
}
