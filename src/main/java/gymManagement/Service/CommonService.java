package gymManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gymManagement.Mapper.CommonMapper;
import gymManagement.model.response.TestResponse;



@Service
public class CommonService {
	
	@Autowired
	private CommonMapper commonMapper;
	
	public TestResponse getUserInfoById(int id) {
		TestResponse response = commonMapper.getUserInfoById(id);
		return response;
	}
}
