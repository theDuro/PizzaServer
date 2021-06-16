package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.PizzaDto;
import pl.edu.pwsztar.domain.entity.Pizza;

import java.util.ArrayList;
import java.util.List;

@Component
public class PizzaListMapper {
    /**
     *
     * @param pizzas
     * @return list of products mapped to Dto
     */
    public List<PizzaDto> mapToDto(List<Pizza> pizzas) {
        List<PizzaDto> pizzasDto = new ArrayList<>();

        for (Pizza pizza : pizzas) {
            PizzaDto pizzaDto = new PizzaDto();

            pizzaDto.setPizzaId(pizza.getPizzaId());
            pizzaDto.setTitle(pizza.getTitle());
            pizzaDto.setCost(pizza.getCost());

            pizzasDto.add(pizzaDto);

        }
        return pizzasDto;
    }
}
