package com.gdn.demo.web.controller;

import com.gdn.demo.entity.Product;
import com.gdn.demo.web.model.ProductResponse;
import com.gdn.demo.web.model.ResponseList;
import com.gdn.demo.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author juan.tjandra
 */
@RestController
public class ProductController {

  @Autowired
  private ProductServiceImpl productService;

  @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseList<ProductResponse> getAllProduct (@RequestHeader String name) {
    Product producta = Product.builder().build();
    List<ProductResponse> productResponses = productService
        .getProducts()
        .stream()
        .map(product -> ProductResponse
            .builder()
            .id(product.getId())
            .name(product.getName())
            .build())
        .collect(Collectors.toList());

    return new ResponseList<>(true, productResponses);
  }
}
