package web.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService implements ModelService {
    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("Volkswagen", "Type 2", "1967"),
            new Car("Chevrolet", "Corvette", "2020"),
            new Car("Peugeot", "202", "1938"),
            new Car("Dodge", "Ram", "2022"),
            new Car("Toyota", "Celica", "1993")
    )
    );

    @Override
    public ModelMap setModel(int count, ModelMap model) {
        return model.addAttribute("cars", carList.subList(0, (count < 6 ? count : 5)));
    }
}
