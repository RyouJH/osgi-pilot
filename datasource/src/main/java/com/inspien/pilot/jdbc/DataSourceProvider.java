package com.inspien.pilot.jdbc;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.sql.DataSource;

@Component(service = DataSourceProvider.class)
public class DataSourceProvider {

	@Reference(target = "(osgi.jndi.service.name=cepaas)")
	private DataSource dataSource;

	@Activate
	public void start(){
		System.out.println(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}
}
