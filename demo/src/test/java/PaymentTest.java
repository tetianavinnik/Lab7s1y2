import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentTest {
    private Payment firstPayment;
    private Payment secondPayment;

    @BeforeEach
    public void init() {
        firstPayment =  new PayPalPaymentStrategy("John", "flowers");
        secondPayment = new CreditCardPaymentStrategy("Valentina", "roses");
    }

    @Test
    public void testPrice() {
        assertEquals("John", firstPayment.getName());
        assertEquals("Valentina", secondPayment.getName());
        assertEquals("flowers", firstPayment.getDescription());
        assertEquals("roses", secondPayment.getDescription());
        assertTrue(firstPayment.pay(100));
        assertTrue(secondPayment.pay(120));
    }
}