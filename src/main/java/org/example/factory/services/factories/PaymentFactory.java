package org.example.factory.services.factories;

import org.example.factory.enums.Country;
import org.example.factory.services.paymentmethods.PaymentMethod;

public interface PaymentFactory {

    public PaymentMethod createPaymentMethod(Country country);
}
