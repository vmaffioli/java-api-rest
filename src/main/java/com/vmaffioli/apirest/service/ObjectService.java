package com.vmaffioli.apirest.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.vmaffioli.apirest.dto.request.ObjectInDTO;
import com.vmaffioli.apirest.dto.response.ReturnOutDTO;
import com.vmaffioli.apirest.interfaces.IObjectService;

@Service
public class ObjectService implements IObjectService {

	public ReturnOutDTO get(@Valid ObjectInDTO entrada) {
		ReturnOutDTO res = new ReturnOutDTO();
		res.setContent("Get ok");
		res.setMessage("Success");
// TODO get service impl

		return res;
	}

	public ReturnOutDTO create(@Valid ObjectInDTO entrada) {
		ReturnOutDTO res = new ReturnOutDTO();
		res.setContent("Create ok");
		res.setMessage("Success");
//	TODO create service impl
		return res;
	}

}
