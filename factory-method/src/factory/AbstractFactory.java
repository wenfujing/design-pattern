package factory;

import product.Product;

/**
 * @author yuanweimin
 * @date 19/05/11 23:01
 * @description 
 */
public abstract class AbstractFactory {
    /**
     * 产品工厂，创建产品
     * @return Product
     */
    public abstract Product create();
}
