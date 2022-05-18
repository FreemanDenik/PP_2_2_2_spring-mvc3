package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.services.CarServiceImp;
import web.services.CarService;

@Controller
public class OtherController {

    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String carsView(ModelMap map, int count){
        map.addAttribute("model", service.getCars(count));
        return "cars";
    }
}
