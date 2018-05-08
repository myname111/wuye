package com.wuye.mapper;

import org.springframework.stereotype.Repository;

import com.wuye.bean.Test;

@Repository
public interface TestMapper {
  public void saveTest(Test test);
  public Test getTestById(int id);
}
