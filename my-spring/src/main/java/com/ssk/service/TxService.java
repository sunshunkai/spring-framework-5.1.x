package com.ssk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * @author 惊云
 * @date 2021/12/6 18:22
 */
@Service
public class TxService {

	@Autowired
	private TestService testService;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void tx() throws SQLException {
		jdbcTemplate.execute("insert into user(name,age) values ('Lisi',22)");
		testService.tx();
	}
}
