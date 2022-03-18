package lk.quadrate.service;

import lk.quadrate.exception.UserNotFoundException;
import lk.quadrate.model.ApplicationUser;
import lk.quadrate.repository.ApplicationUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ApplicationUserService {

    private final ApplicationUserRepository repository;

    public ApplicationUser getApplicationUser(Long id){
        return repository.findApplicationUserById(id)
                .orElseThrow(()->new UserNotFoundException("User With ID: "+id+" Not Fount"));
    }
}
