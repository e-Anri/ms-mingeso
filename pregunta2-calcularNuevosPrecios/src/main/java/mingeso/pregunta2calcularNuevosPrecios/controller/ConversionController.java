package mingeso.pregunta2calcularNuevosPrecios.controller;

import mingeso.pregunta2calcularNuevosPrecios.entity.Conversion;
import mingeso.pregunta2calcularNuevosPrecios.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/conversiones")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping
    public ResponseEntity<List<Conversion>> listaConversiones() {
        List<Conversion> conversiones = conversionService.getAllConversiones();
        if(conversiones.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(conversiones);
    }
}
