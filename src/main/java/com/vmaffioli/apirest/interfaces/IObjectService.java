package com.vmaffioli.apirest.interfaces;

import com.vmaffioli.apirest.dto.request.ObjectInDTO;
import com.vmaffioli.apirest.dto.response.ReturnOutDTO;

public interface IObjectService {

	ReturnOutDTO get(ObjectInDTO inDTO);

	ReturnOutDTO create(ObjectInDTO inDTO);

}
