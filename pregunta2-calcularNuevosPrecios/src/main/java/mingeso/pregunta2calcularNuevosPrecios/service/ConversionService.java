package mingeso.pregunta2calcularNuevosPrecios.service;

import mingeso.pregunta2calcularNuevosPrecios.entity.Conversion;

import java.util.List;

public interface ConversionService {

    public List<Conversion> getAllConversiones();
    public Conversion getConversion(long id);
    public Conversion createConversion(Conversion conversion);
    public Conversion updateConversion(Conversion conversion);
    public Conversion deleteConversion(long id);
}
