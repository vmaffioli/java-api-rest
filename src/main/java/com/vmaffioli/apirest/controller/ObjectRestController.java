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

	@ApiOperation("Get")
	@GetMapping(value = "/get")
	public ReturnOutDTO get(@PathVariable("id") int id) {
		ObjectInDTO inDTO = new ObjectInDTO();
		inDTO.setId(id);

		return service.create(inDTO);
	}

	@ApiOperation("Create")
	@PostMapping(value = "/create")
	public ReturnOutDTO post(@RequestBody @Valid ObjectInDTO inDTO) {

		return service.create(inDTO);
	}

}
