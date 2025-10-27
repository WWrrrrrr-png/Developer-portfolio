package com.kd.basic.admin.statistics;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {

	List<Map<String, Object>> getDailyStatistics(String date); // 2025-09
	
	List<Map<String, Object>> getHourlyStatistics(@Param("start_date") String start_date, @Param("end_date") String end_date);
	
	List<Map<String, Object>> getWeeklyStatistics(@Param("start_date") String start_date, @Param("end_date") String end_date);
	
	List<Map<String, Object>> getMonthlyStatistics(@Param("year") String year);
	
}
