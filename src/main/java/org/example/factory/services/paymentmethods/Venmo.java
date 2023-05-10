package org.example.factory.services.paymentmethods;

import java.util.List;
import org.example.factory.enums.Country;
import org.springframework.stereotype.Service;

@Service
public class Venmo implements PaymentMethod {

    @Override
    public Boolean pay() {
        System.out.println("Using Venmo");
        return null;
    }

    @Override
    public List<Country> getAvailableCountries() {
        return List.of(Country.CANADA);
    }

    @Override
    public Boolean isCripto() {
        return false;
    }
}
