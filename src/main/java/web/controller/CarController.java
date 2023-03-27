package web.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ModelService;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final ModelService service;

    public CarController(@Qualifier("carService") ModelService service) {
        this.service = service;
    }

    @GetMapping
    public String printSomeCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        service.setModel(count, model);
        return "cars";
    }
}