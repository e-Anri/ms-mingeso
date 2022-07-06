package mingeso.pregunta2calcularNuevosPrecios.service;

import mingeso.pregunta2calcularNuevosPrecios.entity.Conversion;
import mingeso.pregunta2calcularNuevosPrecios.repository.ConversionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversionServiceImp implements ConversionService {

    @Autowired
    private ConversionRepository conversionRepository;

    @Override
    public List<Conversion> getAllConversiones() {
        return conversionRepository.findAll();
    }

    @Override
    public Conversion getConversion(long id) {
        return conversionRepository.findById(id).orElse(null);
    }

    @Override
    public Conversion createConversion(Conversion conversion) {
        conversion.setEstado("CREATED");
        return conversionRepository.save(conversion);
    }

    @Override
    public Conversion updateConversion(Conversion conversion) {
        Conversion conversion1 = getConversion(conversion.getId());
        if (null == conversion1){
            return null;
        }

        conversion1.setNombre(conversion.getNombre());
        conversion1.setPrecioCLP(conversion.getPrecioCLP());
        conversion1.setPrecioUSD(conversion1.getPrecioCLP());
        conversion1.setPrecioEUR(conversion1.getPrecioCLP());

        return conversionRepository.save(conversion1);
    }

    @Override
    public Conversion deleteConversion(long id) {
        Conversion conversion1 = getConversion(id);
        if (null == conversion1){
            return null;
        }

        conversion1.setEstado("DELETED");
        return conversionRepository.save(conversion1);
    }
}
