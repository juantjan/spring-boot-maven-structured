package com.gdn.demo.web.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
@Builder
public class ProductResponse {
  private String name;
  private String id;
}
