package com.secondmodule.app.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.secondmodule.app.dto.SecondDto;
import com.secondmodule.app.facade.interfaces.ISecondFacade;

@RestController
@RequestMapping(value = "secondController")
public class SecondController {
	
	@Inject
	ISecondFacade secondFacade;
	
	@RequestMapping(method = RequestMethod.GET)
	public SecondDto get() {
		return this.secondFacade.get();
	}
}
