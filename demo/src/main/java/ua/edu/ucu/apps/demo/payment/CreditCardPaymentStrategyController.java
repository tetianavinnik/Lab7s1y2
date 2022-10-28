package ua.edu.ucu.apps.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/api/v1/cardpayment") @RestController
public class CreditCardPaymentStrategyController {
    @GetMapping
    public List< ? extends Payment> getPayments() {
        return List.of(new CreditCardPaymentStrategy("James", "something"));
    }
}
