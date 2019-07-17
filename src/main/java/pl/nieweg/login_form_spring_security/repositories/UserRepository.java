package pl.nieweg.login_form_spring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nieweg.login_form_spring_security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByFirstName(String username);

}
