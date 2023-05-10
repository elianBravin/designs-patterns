package org.example.factory.services.paymentmethods;

import java.util.List;
import org.example.factory.enums.Country;
import org.springframework.stereotype.Service;

@Service
public class Alipay implements PaymentMethod {

    @Override
    public Boolean pay() {
        System.out.println("Using Alipay");
        return null;
    }

    @Override
    public List<Country> getAvailableCountries() {
        return List.of(Country.CANADA, Country.ESTADOS_UNIDOS);
    }

    @Override
    public Boolean isCripto() {
        return false;
    }
}
