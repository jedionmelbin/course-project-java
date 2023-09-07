
package com.xprotech.app.service.impl;

import com.xprotech.app.repository.ProductRepository;
import com.xprotech.app.service.ProductService;

/**
 *
 * @author jedionmelbin
 */
public class DefaultProductService implements ProductService {
    private final ProductRepository productRepository;

    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
}
