package acwingEveryday;

public class Ac27 {
    public double Power(double base, int exponent) {
        if (base == 0)  return 0;
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            exponent = -exponent;
            base = 1 / base;
        }
        //exponent > 0的情况
        exponent--;
        if (exponent == 0) {
            return base;
        }
        double temp = base;
        while (exponent > 0) {
            base = base * temp;
            if (base - 0 > -0.01 && base - 0 < 0.01) {
                return 0;
            }
            exponent--;
        }
        return base;
    }
}
