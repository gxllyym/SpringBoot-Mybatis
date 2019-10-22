package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;

	@RequestMapping("/select")
	public List<DemoModel> select(){
		return (List<DemoModel>)demoService.getall();
	}
	
	
}





