package vigaristas.adventurejournal.converters;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<S, T> implements Converter<S, T> {

    public List<T> convert(List<S> listToConverter) {

        List<T> conversions = new ArrayList<>(listToConverter.size());

        for (S toConvert : listToConverter) {
            conversions.add(convert(toConvert));
        }
        return conversions;
    }
}
