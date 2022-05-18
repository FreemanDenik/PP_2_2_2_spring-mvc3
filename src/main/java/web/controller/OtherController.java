package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.services.CarService;
import web.services.ICarService;

@Controller
public class OtherController {

    private ICarService service;
    public OtherController(){
        service = new CarService();
    }
    @GetMapping("/cars")
    public String carsView(ModelMap map, int count){
        map.addAttribute("model", service.getCars(count));
        return "cars";
    }
}
