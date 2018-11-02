package com.syaccp.mapper;

import java.util.List;

import com.syaccp.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

   List<News> findAll();

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);
    
    List<News> page(int pageNo,int pageSize);
}