package com.example.demo.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.admin.item.AdmItem;

@Mapper
public interface OverseasInfoMapper {
    OverseasInfo getByItem(AdmItem admItem);
    List<OverseasInfo> list(String invoice);
    void insert(AdmItem entity);
    void update(AdmItem entity);
}
