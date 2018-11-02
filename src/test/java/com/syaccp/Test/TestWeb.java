package com.syaccp.Test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.syaccp.mapper.NewsMapper;
public class TestWeb {
	
	private static SqlSessionFactory sessionFactory; // 连接池

	static {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sessionFactory = builder.build(reader);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	
	@Test
	public void testDelete(){
		SqlSession session = sessionFactory.openSession();
		NewsMapper mapper = session.getMapper(NewsMapper.class);
		mapper.deleteByPrimaryKey(999);
		session.commit();
	}
	
}
