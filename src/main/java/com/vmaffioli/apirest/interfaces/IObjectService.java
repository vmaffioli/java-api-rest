package com.vmaffioli.apirest.interfaces;

import com.vmaffioli.apirest.dto.request.ObjectInDTO;
import com.vmaffioli.apirest.dto.response.ReturnOutDTO;

public interface IObjectService {

	ReturnOutDTO getObjectById(ObjectInDTO inDTO);

	ReturnOutDTO getAllObjects();

	ReturnOutDTO saveObject(ObjectInDTO inDTO);

}
