package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class OtherController {

    @GetMapping("/cars")
    public String carsView(ModelMap map, int count){


        List<Car> carList = Arrays.asList(
                new Car(1, "Audi"),
                new Car(1, "Honda"),
                new Car(1, "Uas"),
                new Car(1, "Mers"),
                new Car(count, "Subaru")
        ).stream().limit(count).toList();
        map.addAttribute("model", carList);
        return "cars";
    }
}
