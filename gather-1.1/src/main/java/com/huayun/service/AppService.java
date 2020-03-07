package com.huayun.service;

import java.util.List;

import com.huayun.model.App;

public interface AppService {

	public List<App> findAll();

	public void addApp(App app);
	
	public App findById(Long id);

	public void appUpdate(App app);

	public void deleteById(Long id);

}
