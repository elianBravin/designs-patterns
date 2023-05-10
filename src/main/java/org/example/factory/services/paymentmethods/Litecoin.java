package org.example.factory.services.paymentmethods;

import java.util.List;
import org.example.factory.enums.Country;
import org.springframework.stereotype.Service;

@Service
public class Litecoin implements PaymentMethod {

    @Override
    public Boolean pay() {
        System.out.println("Using Litecoin");
        return null;
    }

    @Override
    public List<Country> getAvailableCountries() {
        return List.of(Country.ARGENTINA, Country.ESPAÑA, Country.CANADA, Country.FRANCIA, Country.ESTADOS_UNIDOS);
    }

    @Override
    public Boolean isCripto() {
        return true;
    }
}
