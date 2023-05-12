package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/*
 * Created by Freddie Molina 12/05/23.
 * */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
