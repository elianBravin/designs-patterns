package org.example.factory.controllers;

import org.example.factory.enums.Country;
import org.example.factory.services.factories.CountryPaymentFactory;
import org.example.factory.services.factories.CriptoPaymentFactory;
import org.example.factory.services.paymentmethods.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FactoryController {

    @Autowired
    CountryPaymentFactory countryPaymentFactory;
    @Autowired
    CriptoPaymentFactory criptoPaymentFactory;

    @PostMapping("/country/{country}/payment")
    public ResponseEntity<?> createCountryPayment(@PathVariable(value = "country") Country country) {

        PaymentMethod paymentMethod = countryPaymentFactory.createPaymentMethod(country);
        paymentMethod.pay();

        return ResponseEntity.ok("Payment ok");
    }

    @PostMapping("/country/{country}/payment/cripto")
    public ResponseEntity<?> createCriptoPayment(@PathVariable(value = "country") Country country) {

        PaymentMethod paymentMethod = criptoPaymentFactory.createPaymentMethod(country);
        paymentMethod.pay();

        return ResponseEntity.ok("Payment ok");
    }
}
