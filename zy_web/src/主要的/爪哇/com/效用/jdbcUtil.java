package com.util;


import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/*
 *  工具类
 *  
 * 
 * */

public class jdbcUtil {
   
	 //1.初始化连接池
	private static  DataSource dataSource;
	
	static {
		//创建c3p0连接池核心工具类
		 //自动加载src下c3p0的配置文件
		dataSource=new ComboPooledDataSource();
		
		
	}
	 //2.创建DButils核心工具类对象 xiugaile
	
	public static QueryRunner getQueryRunner(){
		//创建QueryRunner对象，传入连接池对象
 // QueryRunner() 括号里传入了数据源对象 ，	使用QueryRunner对象方法的时候，不需要传入连接对象了，
		// 会自动从数据源中获取连接，不用关闭连接
		QueryRunner qr=new QueryRunner(dataSource);
               
		return qr; 
	}
	
	
}
