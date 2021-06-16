/**
 * @author Krzysztof Piechnik
 * @author Dawid Durołek
 */
package pl.edu.pwsztar.controller;

import com.itextpdf.text.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.PizzaDto;
import pl.edu.pwsztar.operator.TotalCostCalculate;
import pl.edu.pwsztar.service.PizzaService;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping(value = "/api")
public class PizzaApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaApiController.class);

    private final PizzaService pizzaService;

    /**
     *
     * @param pizzaService
     */
    @Autowired
    public PizzaApiController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    /**
     *
     * @return list of products
     */
    @CrossOrigin
    @GetMapping(value = "/pizzas", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PizzaDto>> getPizzas() {
        LOGGER.info("Get all pizzas");

        List<PizzaDto> PizzaDto = pizzaService.findAll();
        return new ResponseEntity<>(PizzaDto, HttpStatus.OK);
    }

    /**
     *
     * @param pizzaList
     * @return status of creating order
     * @throws IOException
     * @throws DocumentException
     */
    @CrossOrigin
    @PostMapping(value = "/order")
    public ResponseEntity<?> order(@RequestBody List<Integer> pizzaList) throws IOException, DocumentException {
        TotalCostCalculate totalCostCalculate = new TotalCostCalculate(pizzaService);
        try {
            totalCostCalculate.getParagon(pizzaList);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (DocumentException e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);

    }

}
