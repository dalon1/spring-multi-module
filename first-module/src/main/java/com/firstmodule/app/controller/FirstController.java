package com.firstmodule.app.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstmodule.app.dto.FirstDto;
import com.firstmodule.app.facade.interfaces.IFirstFacade;

@RestController
@RequestMapping(value = "firstController")
public class FirstController {
	
	@Inject
	IFirstFacade firstFacade;
	
	@RequestMapping(method = RequestMethod.GET)
	public FirstDto getFirst() {
		return this.firstFacade.get();
	}
}
