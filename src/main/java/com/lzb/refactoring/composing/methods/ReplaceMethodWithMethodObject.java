package com.lzb.refactoring.composing.methods;

/**
 * <br/>
 * Created on : 2022-07-08 08:32
 *
 * @author lizebin
 */
public class ReplaceMethodWithMethodObject {

    class Order {
        public double price() {
            double primaryBasePrice;
            double secondaryBasePrice;
            double tertiaryBasePrice;
            return 0;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后：这里的 Order1 order 就是聚合读模型，有些时候外部业务需要依赖【读模型】，而不是把这块逻辑封装到【读模型】
    ///////////////////////////////////////////////////////////////////////////

    class Order1 {
        public double price() {
            return new PriceCalculator(this).compute();
        }
    }

    class PriceCalculator {
        private double primaryBasePrice;
        private double secondaryBasePrice;
        private double tertiaryBasePrice;

        public PriceCalculator(Order1 order) {
            // Copy relevant information from the
            // order object.
        }

        public double compute() {
            // Perform long computation.
            return 0;
        }
    }

}
