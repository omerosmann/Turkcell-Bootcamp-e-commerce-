package e.commerce.ecommerce.business.dto.responses.gets.IndividualCustomer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetIndividualCustomerResponse {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private LocalDate dateOfBirth;
    private String roleName;
}
