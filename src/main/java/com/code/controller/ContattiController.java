package com.code.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.code.controller.base.ContattiBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/Code.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class ContattiController extends ContattiBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
