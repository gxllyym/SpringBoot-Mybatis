package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.DemoModel;

@Service
public class DemoServiceImp implements DemoService {
	@Autowired
	private DemoMapper demoMapper;

	@Override
	public List<DemoModel> getall() {
		return (List<DemoModel>) demoMapper.selectall();
	}

}
