package com.gdn.demo.service.impl;

import com.gdn.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * @author juan.tjandra
 */
@Service
public class ProductServiceImpl {
  public List<Product> getProducts() {
    return Arrays.asList(Product.builder().id("TEST").name("PRODDUCT").build());
  }
}
