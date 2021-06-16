package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.domain.dto.PizzaDto;

import java.util.List;


public interface PizzaService {
    /**
     *
     * @return list of products
     */
    List<PizzaDto> findAll();

    /**
     *
     * @param pizzaId
     * @return product id from repository
     */
    PizzaDataDto findOneByPizzaId(Long pizzaId);
}
