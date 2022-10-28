import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.payment.Payment;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentTest {
    private Payment payment1;
    private Payment payment2;

    @BeforeEach
    public void init() {
        payment1 =  new PayPalPaymentStrategy("John", "flowers");
        payment2 = new CreditCardPaymentStrategy("Valentina", "roses");
    }

    @Test
    public void testPrice() {
        assertEquals("John", payment1.getName());
        assertEquals("Valentina", payment2.getName());
        assertEquals("flowers", payment1.getDescription());
        assertEquals("roses", payment2.getDescription());
        assertTrue(payment1.pay(100));
        assertTrue(payment2.pay(120));
    }
}