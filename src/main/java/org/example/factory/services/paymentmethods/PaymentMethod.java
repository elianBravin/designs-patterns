package org.example.factory.services.paymentmethods;

import java.util.List;
import org.example.factory.enums.Country;

public interface PaymentMethod {

    Boolean pay();
    List<Country> getAvailableCountries();
    Boolean isCripto();
}
