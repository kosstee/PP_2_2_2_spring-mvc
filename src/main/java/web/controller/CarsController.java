package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public String printCars(ModelMap model, @RequestParam(required = false, name = "count") Integer count) {
        model.addAttribute("cars", carsService.getCars(count));
        return "cars";
    }
}
