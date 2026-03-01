package in.varsha.foodiesapi.service;

import in.varsha.foodiesapi.io.UserRequest;
import in.varsha.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
