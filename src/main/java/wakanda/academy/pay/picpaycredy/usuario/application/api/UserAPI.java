package wakanda.academy.pay.picpaycredy.usuario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import wakanda.academy.pay.picpaycredy.usuario.application.api.request.UserRequest;
import wakanda.academy.pay.picpaycredy.usuario.application.api.response.UserResponse;

@RestController
@RequestMapping(value =  "v1/user")
public interface UserAPI {
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	UserResponse createUser(@RequestBody UserRequest userRequest);

}
