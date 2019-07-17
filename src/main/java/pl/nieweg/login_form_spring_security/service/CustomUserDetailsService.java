package pl.nieweg.login_form_spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.nieweg.login_form_spring_security.model.CustomUserDetails;
import pl.nieweg.login_form_spring_security.model.User;
import pl.nieweg.login_form_spring_security.repositories.UserRepository;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Optional<User> optionalUser = userRepository.findByFirstName(username);

        optionalUser
               .orElseThrow(() ->  new UsernameNotFoundException("Username not found!!!"));

        return optionalUser
                .map(CustomUserDetails::new).get();
    }
}
