package com.vmaffioli.apirest.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReturnOutDTO {

	private Object content;
    private String message;

}
