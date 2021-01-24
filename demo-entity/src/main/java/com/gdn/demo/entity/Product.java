package com.gdn.demo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
@Builder
public class Product {
  private String id;
  private String name;
}
