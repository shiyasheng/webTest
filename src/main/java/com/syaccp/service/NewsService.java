package com.syaccp.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.syaccp.entity.News;

public interface NewsService {

	List<News> findAll();
	
	public PageInfo<News> page(int pageNo,int pageSize);

}