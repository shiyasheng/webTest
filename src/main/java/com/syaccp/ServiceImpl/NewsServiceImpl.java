package com.syaccp.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syaccp.entity.News;
import com.syaccp.mapper.NewsMapper;
import com.syaccp.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
	
	public NewsServiceImpl() {
		super();
		System.out.println("NewsServiceImpl");
	}
	
	@Resource
	private NewsMapper newsMapper;
	
	@Override
	public List<News> findAll(){
		return newsMapper.findAll();
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public PageInfo<News> page(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<News> list = newsMapper.findAll();
		PageInfo<News> page=new PageInfo<News>(list);
		return page;
	}
}
