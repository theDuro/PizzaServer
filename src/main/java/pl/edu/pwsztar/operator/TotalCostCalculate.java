package pl.edu.pwsztar.operator;

import com.itextpdf.text.DocumentException;
import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.domain.dto.PizzaOrderDto;
import pl.edu.pwsztar.service.PizzaService;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TotalCostCalculate {
    final PizzaService pizzaService;

    public TotalCostCalculate(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    public  PizzaOrderDto pizzaCalculate(List<PizzaDataDto> pizzaList) {
       ;
        int totalCost=0;
        for (PizzaDataDto pizzaDataDto : pizzaList) {
            totalCost+=pizzaDataDto.getCost();
        }
      return new PizzaOrderDto(totalCost,pizzaList);
    }

     public  void getParagon(List<Integer> idList) throws IOException, DocumentException {

         List<PizzaDataDto> pizaList=new LinkedList<>() ;
        for (int pizaId:idList){
            pizaList.add(pizzaService.findOneByMovieId((long) pizaId));

        }
        PizzaPdfGenerator.createPdf(pizaList);



    }

}
