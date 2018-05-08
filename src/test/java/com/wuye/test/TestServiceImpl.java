package com.wuye.test;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuye.bean.Test;
import com.wuye.mapper.TestMapper;
@Service
@Transactional
public class TestServiceImpl implements ITestService {
    @Autowired
    private TestMapper testMapper;
	public void saveTest(Test test) {
		// TODO Auto-generated method stub
		testMapper.saveTest(test);
	}

	public Test getTestById(int id) {
		// TODO Auto-generated method stub
		Test test = testMapper.getTestById(id);
		return test;
	}

}
