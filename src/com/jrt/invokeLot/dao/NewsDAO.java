package com.jrt.invokeLot.dao;

import java.util.List;

import com.jrt.invokeLot.model.News;
import com.jrt.invokeLot.util.ListRange;

public interface NewsDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	void insert(News record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	void insertSelective(News record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	News selectByPrimaryKey(Long id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	int updateByPrimaryKeySelective(News record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table News
	 * @ibatorgenerated  Wed Nov 24 10:59:30 CST 2010
	 */
	int updateByPrimaryKey(News record);

	int getNewsCount(Long categoryId, String type);
	
	News getNewsById(Long id,String type);

    List<News> getNewsListByPubDateDesc(Long categoryId, String type,int startRow,int pageSize);
    List<News> getNewsListByPubDateAsc(Long categoryId, String type,int startRow,int pageSize);
    
   // List<News> getNewsPageList(String categoryId, int from, int size);
    
    ListRange<News> selectNewsListDesc(ListRange<News> range);
    ListRange<News> selectNewsListAsc(ListRange<News> range);

}