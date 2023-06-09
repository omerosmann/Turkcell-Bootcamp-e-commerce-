package e.commerce.ecommerce.business.rules;



import e.commerce.ecommerce.core.exceptions.BusinessException;
import e.commerce.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBusinessRules {
    private final UserRepository userRepository;
    public void checkIfUserExistsByEmail(String email){
        if (!userRepository.existsByEmail(email)){
            throw new BusinessException("This User Not Found By This Email");
        }
    }
    public void checkIfUserExistsById(int id){
        if (!userRepository.existsById(id)){
            throw new BusinessException("This User Not Found By This id");
        }
    }
}
