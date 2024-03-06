package wakanda.academy.pay.picpaycredy.usuario.application.api.request;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import wakanda.academy.pay.picpaycredy.usuario.domain.enums.UserType;
public record UserRequest(

		String firstName,

		String lastName,

		@Column(unique = true)
		String document,

		@Column(unique = true)
		String email,

		BigDecimal balance,

		@Enumerated(EnumType.STRING)
		UserType userType) {

}
