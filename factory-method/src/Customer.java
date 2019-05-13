import factory.AMDFactory;
import factory.InterFactory;
import product.CPU;

/**
 * @author yuanweimin
 * @date 19/05/13 09:59
 * @description 
 */
public class Customer {
    public static void main(String[] args) {
        CPU interCPU = new InterFactory().createCPU();
        interCPU.useCPU();

        CPU amdCPU = new AMDFactory().createCPU();
        amdCPU.useCPU();
    }
}
