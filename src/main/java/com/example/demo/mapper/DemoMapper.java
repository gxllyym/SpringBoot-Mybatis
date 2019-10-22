package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.DemoModel;

@Mapper
public interface DemoMapper {
	List<DemoModel> selectall();

}
