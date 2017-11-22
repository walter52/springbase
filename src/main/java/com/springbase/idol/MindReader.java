package com.springbase.idol;

/**
 * @author walterwu
 * @date 2017/11/21
 */
public interface MindReader {
  void interceptThoughts(String thoughts);
  String getThoughts();
}
