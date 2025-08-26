package com.kd.basic.admin.category;

import java.util.List;

public interface AdCategoryMapper {

	// 1차카테고리 목록
	List<CategoryDTO> getFirstCategoryList();

	// 1차카테고리를 참조하는 2차카테고리 목록
	List<CategoryDTO> getSecondCategoryList(Integer firstCategoryCode);
	
}
