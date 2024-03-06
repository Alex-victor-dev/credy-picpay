package wakanda.academy.pay.picpaycredy.usuario.application.api.response;

import java.util.UUID;

import wakanda.academy.pay.picpaycredy.usuario.domain.entity.User;

public record UserResponse(UUID idUser) {
	
	public UserResponse(User user) {
		this(user.getIdUser());
	}

}
