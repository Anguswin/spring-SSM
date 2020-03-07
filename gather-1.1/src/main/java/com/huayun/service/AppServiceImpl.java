package com.huayun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huayun.dao.AppMapperDao;
import com.huayun.model.App;

@Service
public class AppServiceImpl implements AppService{

	@Autowired
	private AppMapperDao appMapper;
	
	@Override
	public List<App> findAll() {
		List<App> appList = appMapper.findAll();
		return appList;
	}

	@Override
	public void addApp(App app) {
		appMapper.addApp(app);
	}
	
	
	@Override
	public App findById(Long id) {
		App app = appMapper.findById(id);
		return app;
	}

	@Override
	public void appUpdate(App app) {
		appMapper.appUpdate(app);
		
	}

	@Override
	public void deleteById(Long id) {
		appMapper.appDelete(id);
		
	}


	
	
}
