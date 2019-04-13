package com.example.demo.admin.manage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdmManageMapper {

	AdmManage getById(String id);
	List<AdmManage> list();
	void insert(AdmManage entity);
	void delete(String id);
	void update(AdmManage entity);
	AdmManage login(AdmManage entity);
}
