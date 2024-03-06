package wakanda.academy.pay.picpaycredy.usuario.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import wakanda.academy.pay.picpaycredy.usuario.application.api.request.UserRequest;
import wakanda.academy.pay.picpaycredy.usuario.application.api.response.UserResponse;
import wakanda.academy.pay.picpaycredy.usuario.application.service.UserService;

@Log4j2
@RestController
@RequiredArgsConstructor
public class UserController implements UserAPI {

	private final UserService userService;

	@Override
	public UserResponse createUser(UserRequest userRequest) {
		log.info("[start] UserController - createUser");
		log.info("[UserRequest] {}", userRequest);	
		UserResponse userResponse = userService.createUser(userRequest);
		log.info("[finish] UserController - createUser");
		return userResponse;
	}

}
