package factory;

import product.AMD;
import product.CPU;

public class AMDFactory extends CPUFactory {
    @Override
    public CPU createCPU() {
        return new AMD();
    }
}
