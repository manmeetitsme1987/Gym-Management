package gymManagement.Mapper;

import gymManagement.model.response.TestResponse;

public interface CommonMapper {
	
	//method to fetch the base 
	TestResponse getUserInfoById(int id);
}
