package org.example.factory.services.factories;

import java.util.List;
import org.example.factory.enums.Country;
import org.example.factory.services.paymentmethods.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryPaymentFactory implements PaymentFactory {

    @Autowired
    List<PaymentMethod> paymentMethods;

    @Override
    public PaymentMethod createPaymentMethod(Country country) {
        return paymentMethods.stream()
                .filter((PaymentMethod paymentMethod) ->
                        paymentMethod.getAvailableCountries().stream()
                                .anyMatch(c -> c.equals(country)))
                .findFirst()
                .get();
    }
}
