package factory;

import product.Product;

/**
 * @author yuanweimin
 * @date 19/05/10 11:18
 * @description 工厂接口
 */
public interface Factory {
    /**
     * 创建产品
     * @return Product 产品
     */
    Product createProd();
}
