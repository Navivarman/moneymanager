package in.navi.moneymanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1.0"})
public class HomeController {
    @GetMapping("health")
    public  String healthCheck(){
        return "Application is running";
    }
}
