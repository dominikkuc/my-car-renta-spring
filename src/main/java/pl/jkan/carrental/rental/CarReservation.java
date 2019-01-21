package pl.jkan.carrental.rental;


import lombok.*;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CarReservation {
    int clientID;
    int days;
    double pricePerDay;
    boolean isPaid = false;
}
