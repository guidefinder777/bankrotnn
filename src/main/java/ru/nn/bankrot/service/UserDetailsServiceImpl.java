package ru.nn.bankrot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.nn.bankrot.enitty.UserEntity;

@Service
@ComponentScan("ru.nn.bankrot")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity user = userDAO.findByUserName(userName);
        return user;
    }
}
