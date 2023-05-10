package org.example.factory.services.factories;

import java.util.List;
import org.example.factory.enums.Country;
import org.example.factory.services.paymentmethods.PaymentMethod;
import org.springframework.stereotype.Service;

@Service
public class CriptoPaymentFactory implements PaymentFactory {

    final List<PaymentMethod> paymentMethods;

    public CriptoPaymentFactory(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public PaymentMethod createPaymentMethod(Country country) {
        return paymentMethods.stream()
                .filter((PaymentMethod paymentMethod) ->
                        paymentMethod.getAvailableCountries().stream()
                                .anyMatch(c -> c.equals(country)))
                .filter((PaymentMethod paymentMethod) -> paymentMethod.isCripto())
                .findFirst()
                .get();
    }
}
