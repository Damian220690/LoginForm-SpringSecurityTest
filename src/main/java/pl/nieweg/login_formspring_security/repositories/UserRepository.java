package pl.nieweg.login_formspring_security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nieweg.login_formspring_security.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
