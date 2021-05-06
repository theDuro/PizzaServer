package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.domain.dto.PizzaDto;

import java.util.List;

public interface PizzaService {
//todo adding metchods
    List<PizzaDto> findAll();
    PizzaDataDto findOneByMovieId(Long movieId);
}
