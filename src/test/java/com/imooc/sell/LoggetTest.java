package com.imooc.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public  class LoggetTest<Slf4j> {

  private  final Logger logger= LoggerFactory.getLogger(LoggetTest.class);

  @Test
  public void  Test(){
      logger.info("info");
      logger.debug("debug");
      logger.error("err");
  }
}
