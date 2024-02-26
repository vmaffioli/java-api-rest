package com.vmaffioli.apirest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmaffioli.apirest.dto.request.ObjectInDTO;
import com.vmaffioli.apirest.dto.response.ReturnOutDTO;
import com.vmaffioli.apirest.interfaces.IObjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Object")
@RestController
@RequestMapping(value = "/object")
@Validated
public class ObjectRestController {

	@Autowired
	private IObjectService service;

	@ApiOperation("Get Object by ID")
	@GetMapping(value = "/{id}")
	public ReturnOutDTO get(@PathVariable("id") Integer id) {
		ObjectInDTO inDTO = new ObjectInDTO();
		inDTO.setId(id);

		return service.getObjectById(inDTO);
	}

	@ApiOperation("Get All Objects")
	@GetMapping
	public ReturnOutDTO getAll() {

		return service.getAllObjects();
	}

	@ApiOperation("Save Object")
	@PostMapping
	public ReturnOutDTO post(@RequestBody @Valid ObjectInDTO inDTO) {

		return service.saveObject(inDTO);
	}

}
