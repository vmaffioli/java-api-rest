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

	@NotNull(message = "ID not found")
	private int id;

	@NotBlank(message = "DETAILS not found")
	private String details;

}
