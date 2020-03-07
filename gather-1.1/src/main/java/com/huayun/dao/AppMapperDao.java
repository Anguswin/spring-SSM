package com.huayun.dao;

import java.util.List;

import com.huayun.model.App;

public interface AppMapperDao {

	public List<App> findAll();
	
	public void addApp(App app);
	
	public void updateApp(App app);
	
	public App findById(Long id);

	public void appUpdate(App app);

	public void appDelete(Long id);

}
