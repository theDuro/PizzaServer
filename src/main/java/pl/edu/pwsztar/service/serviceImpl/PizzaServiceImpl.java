package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.domain.dto.PizzaDto;
import pl.edu.pwsztar.domain.entity.Pizza;
import pl.edu.pwsztar.domain.mapper.PizzaListMapper;
import pl.edu.pwsztar.repository.PizzaRepository;
import pl.edu.pwsztar.service.PizzaService;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PizzaServiceImpl.class);

    private final PizzaRepository pizzaRepository;
    private final PizzaListMapper pizzaListMapper;

    @Autowired
    public PizzaServiceImpl(PizzaRepository pizzaRepository,
                            PizzaListMapper pizzaListMapper) {

        this.pizzaRepository = pizzaRepository;
        this.pizzaListMapper = pizzaListMapper;
    }

    @Override
    public List<PizzaDto> findAll() {
        List<Pizza> pizzas = pizzaRepository.findAll();
        return pizzaListMapper.mapToDto(pizzas);
    }

    @Override
    public Pizza findOneByMovieId(Long movieId) {
        return pizzaRepository.findOneByMovieId(movieId);
    }
}
