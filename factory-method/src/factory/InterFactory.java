package factory;

import product.CPU;
import product.Inter;

public class InterFactory extends CPUFactory {

    @Override
    public CPU createCPU() {
        return new Inter();
    }
}
