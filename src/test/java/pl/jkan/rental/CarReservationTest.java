package pl.jkan.rental;

import org.junit.Test;
import pl.jkan.carrental.rental.CarReservation;

public class CarReservationTest {
    public CarReservation buildWithBuilder() {
        return  CarReservation.builder()
                .clientID(1234)
                .days(2)
                .pricePerDay(100)
                .build();
    }

    @Test
    public void paymentCheck() {
        CarReservation cr = buildWithBuilder();
        cr.setPaid(true);
    }
}
