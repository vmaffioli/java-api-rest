package com.vmaffioli.apirest.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vmaffioli.apirest.dto.request.ObjectInDTO;
import com.vmaffioli.apirest.dto.response.ReturnOutDTO;
import com.vmaffioli.apirest.entity.ObjectEntity;
import com.vmaffioli.apirest.interfaces.IObjectService;
import com.vmaffioli.apirest.repository.ObjectRepository;

@Service
public class ObjectService implements IObjectService {

	@Autowired
	private ObjectRepository objectRepository;

	@Override
	public ReturnOutDTO getObjectById(ObjectInDTO inDTO) {
		ReturnOutDTO outDTO = new ReturnOutDTO();

		outDTO.setContent(objectRepository.findById(inDTO.getId()).orElse(null));
		outDTO.setMessage((outDTO.getContent() != null) ? "SUCESSO" : "NOT FOUND");

		return outDTO;
	}

	@Override
	public ReturnOutDTO getAllObjects() {
		ReturnOutDTO outDTO = new ReturnOutDTO();

		outDTO.setContent(objectRepository.findAll());
		outDTO.setMessage((outDTO.getContent()!= null) ? "SUCESSO" : "NOT FOUND");

		return outDTO;
	}

	public ReturnOutDTO saveObject(@Valid ObjectInDTO inDTO) {
		ReturnOutDTO outDTO = new ReturnOutDTO();

		ObjectEntity entity = new ObjectEntity();
		entity.setDetails(inDTO.getDetails());

		outDTO.setContent(objectRepository.save(entity));
		outDTO.setMessage((outDTO.getContent() != null) ? "SUCESSO" : "NOT FOUND");

		return outDTO;
	}

}
