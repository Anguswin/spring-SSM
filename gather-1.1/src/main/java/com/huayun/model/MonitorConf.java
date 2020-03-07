package com.huayun.model;

import java.util.Date;
/**
 * 监控配置表
 *
 */
public class MonitorConf {

	private Long id;			
	private Date startTime;	
	private String 	monitorCron;	//时间策略
	private Long tableRelationId;	//	外键	
	private Long taskId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getMonitorCron() {
		return monitorCron;
	}
	public void setMonitorCron(String monitorCron) {
		this.monitorCron = monitorCron;
	}
	public Long getTableRelationId() {
		return tableRelationId;
	}
	public void setTableRelationId(Long tableRelationId) {
		this.tableRelationId = tableRelationId;
	}
	public Long getTaskId() {
		return taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	
	
}

