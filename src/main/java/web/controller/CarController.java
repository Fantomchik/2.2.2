package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    @GetMapping("cars")
    public String printCarTable(ModelMap model, @RequestParam(value = "count", required = false) String strCount) {

        model.addAttribute("table", CarServiceImpl.outWithParam(strCount));

        return "cars";
    }
}
