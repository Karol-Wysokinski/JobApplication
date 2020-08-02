package pl.sda.JobOfferApplication.user.service;

import pl.sda.JobOfferApplication.user.exception.UserException;
import pl.sda.JobOfferApplication.user.model.UserInput;
import pl.sda.JobOfferApplication.user.model.UserOutput;

import java.util.List;

public interface UserService {

    void createUser(UserInput userInput) throws UserException;

    List<UserOutput> getAllUsers();

    UserOutput getUserById(Long id) throws UserException;

//    UserInput validateUserInput(String login) throws UserException;
}
