package com.firstmodule.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstmodule.app.dto.FirstDto;

@RestController
public class FirstController {
	@RequestMapping(value = "firstController", method = RequestMethod.GET)
	public FirstDto getFirst() {
		return null;
	}
}
