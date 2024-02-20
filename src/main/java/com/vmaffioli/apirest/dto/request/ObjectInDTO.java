package com.vmaffioli.apirest.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ObjectInDTO {

	@NotNull(message = "Sistema origem não informado")
	private int id;

	@NotBlank(message = "Usuário logado não informado")
	private String value;

}
