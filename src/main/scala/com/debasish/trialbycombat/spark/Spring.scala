package com.debasish.trialbycombat.spark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.{ApplicationArguments, ApplicationRunner, SpringApplication}

/**
  * Created by dxk115 on 8/20/2018.
  */

@SpringBootApplication
class Spring extends ApplicationRunner {

  override def run(args: ApplicationArguments): Unit = {

    println("Started")
  }
}

object Spring {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Spring], args:_*)
  }
}
