package com.gdn.demo.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author juan.tjandra
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
  private boolean success;
  private T Data;
}
