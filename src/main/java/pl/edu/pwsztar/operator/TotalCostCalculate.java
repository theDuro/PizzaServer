package pl.edu.pwsztar.operator;

import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.domain.dto.PizzaOrderDto;

import java.util.LinkedList;
import java.util.List;

public class TotalCostCalculate {
    public  PizzaOrderDto pizzaCalculate(List<PizzaDataDto> pizzaList) {
        int totalCost=0;
        for (PizzaDataDto pizzaDataDto : pizzaList) {
            totalCost+=pizzaDataDto.getCost();
        }
      return new PizzaOrderDto(totalCost,pizzaList);
    }

     public  List<PizzaDataDto> getSqlTable(List<Integer> idList){
         List<PizzaDataDto> pizaList=new LinkedList<>() ;
        for (int pizaId:idList){

        }


    return pizaList;
    }

}
