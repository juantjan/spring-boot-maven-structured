package com.gdn.demo.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author juan.tjandra
 */
@Data
@Builder
@NoArgsConstructor
public class ResponseList <T> {
  private boolean success;
  private List<T> data;

  public ResponseList (boolean success, List<T> data) {
    this.success = success;
    this.data = data;
  }
}
