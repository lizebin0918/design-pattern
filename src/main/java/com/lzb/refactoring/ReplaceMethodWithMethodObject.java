package com.lzb.refactoring;

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
    //
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
