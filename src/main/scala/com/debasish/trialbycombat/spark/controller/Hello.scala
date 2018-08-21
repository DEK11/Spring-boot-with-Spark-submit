package com.debasish.trialbycombat.spark.controller

import org.apache.spark.sql.SparkSession
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
/**
  * Created by dxk115 on 8/20/2018.
  */
@RestController
class Hello {

  val spark: SparkSession = SparkSession.builder().appName("Test").getOrCreate()

  @RequestMapping(Array("/"))
  def indexString: String = {
    val path = "src/main/resources/temp.csv"
    val df = spark.read.option("header", "true").csv(path)
    df.columns.mkString(", ")
  }
}
