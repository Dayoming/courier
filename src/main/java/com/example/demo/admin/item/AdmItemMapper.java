package com.example.demo.admin.item;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdmItemMapper {
	AdmItem getById(String id);
	List<AdmItem> list();
	void insert(AdmItem entity);
	void delete(String id);
	void update(AdmItem entity);
}
