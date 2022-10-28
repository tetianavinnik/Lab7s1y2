package ua.edu.ucu.apps.demo.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@AllArgsConstructor
public abstract class Payment {
     private String name;
     private final String description;
     @Setter
     private boolean paymentCheck = false;

     public Payment(String name, String description) {
          this.name = name;
          this.description = description;
     }

     public boolean getPaymentCheck() {
          return this.paymentCheck;
     }

     public boolean pay(double price) {
          this.setPaymentCheck(true);
          return paymentCheck;
     };
}