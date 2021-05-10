package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.PizzaDto;
import pl.edu.pwsztar.domain.dto.PizzaOrderDto;
import pl.edu.pwsztar.operator.TotalCostCalculate;
import pl.edu.pwsztar.service.PizzaService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class PizzaApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaApiController.class);

    private final PizzaService pizzaService;

    @Autowired
    public PizzaApiController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @CrossOrigin
    @GetMapping(value = "/pizzas", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PizzaDto>> getPissas() {
        LOGGER.info("find all movies");

        List<PizzaDto> moviesDto = pizzaService.findAll();
        return new ResponseEntity<>(moviesDto, HttpStatus.OK);
    }
    @PostMapping(value = "/movies")
    public ResponseEntity<?> createMovie(@RequestBody List<Integer> pizzaList) {



        return new ResponseEntity<>(HttpStatus.CREATED);
    }




}
