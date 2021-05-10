package pl.edu.pwsztar.operator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.service.PizzaService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class PizzaPdfGenerator {


    public static  void createPdf(List<PizzaDataDto> pizzaParagon)
            throws DocumentException, IOException {
        PizzaService pizzaService;
        int totalCost =0;
        Document document = new Document();
        PdfWriter.getInstance(
                document, new FileOutputStream("Paragon"));
        document.open();
        for(PizzaDataDto pizza:pizzaParagon) {
            document.add(new Paragraph(" " + pizza.getTitle() + " " + pizza.getCost() + " zl"));
            totalCost+=pizza.getCost();
        }
        document.add(new Paragraph("Całkowity Koszt :" ));
        document.close();
    }
}
