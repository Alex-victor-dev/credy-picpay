package wakanda.academy.pay.picpaycredy.usuario.application.service;

import wakanda.academy.pay.picpaycredy.usuario.application.api.request.UserRequest;
import wakanda.academy.pay.picpaycredy.usuario.application.api.response.UserResponse;

public interface UserService {

	UserResponse createUser(UserRequest userRequest);

}
