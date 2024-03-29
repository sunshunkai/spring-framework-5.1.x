package com.ssk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author jingyun
 * @date 2019-12-10
 * @describe
 */
@Service
public class TestService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void tx() throws SQLException {
		jdbcTemplate.execute("insert into user(name,age) values ('ssk',12)");
//		throw new RuntimeException();
	}
}
