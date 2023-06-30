package web.controller;

import Models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCars(Model model, @RequestParam(name = "count", defaultValue = "5") int count) {
        List<Car> cars = carService.getCarList(count);
        model.addAttribute("carList", cars);
        return "cars";
    }
 }
