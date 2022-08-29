package com.example.demo.business.abstracts;

import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
     DataResult<List<Product>> getAll();
     Result add(Product product);

     DataResult<Product> getByProductName(String productName);

     DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

     DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

     DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

     DataResult<List<Product>> getByProductNameContains(String productName);

     DataResult<List<Product>> getByProductNameStartsWith(String productName);

     DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
