package com.thirdmodule.app.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thirdmodule.app.dto.ThirdDto;
import com.thirdmodule.app.facade.interfaces.IThirdFacade;

@RestController
@RequestMapping(value = "thirdController")
public class ThirdController {
	
	@Inject
	IThirdFacade thirdFacade;
	
	@RequestMapping(method = RequestMethod.GET)
	public ThirdDto get() {
		return this.thirdFacade.get();
	}
}
