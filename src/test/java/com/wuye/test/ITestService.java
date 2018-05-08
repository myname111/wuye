package com.wuye.test;

import com.wuye.bean.Test;

public interface ITestService {
   public void saveTest(Test test);
   public Test getTestById(int id);
}
