// selected constructors
// after type dependency analysis
Apfloat real = new Apfloat(/* TODO */);
Apfloat imag = new Apfloat(/* TODO */);
Apcomplex c1 = new Apcomplex(real, imag);

// object instantiation statements
float real_value = 1.0f;
float imag_value = 2.0f;
Apfloat real = new Apfloat(real_value);
Apfloat imag = new Apfloat(imag_value);
Apcomplex c1 = new Apcomplex(real, imag);

package org.example;

import org.apfloat.internal.DoubleModMath;
import org.junit.Test;

public class TestModPow {
    @Test
    public void testModPow() {
        DoubleModMath dmm = new DoubleModMath();
        // assign "1" to modulus
        dmm.setModulus(1);
        // throw java.lang.StackOverflowError
        dmm.modPow(4, -4);
    }
}


public static Apcomplex
pow(Apcomplex z, long n) {
  ...
}


float real_value = 1.0f;
float imag_value = 2.0f;
Apfloat real = new Apfloat(real_value);
Apfloat imag = new Apfloat(imag_value);
Apcomplex c1 = new Apcomplex(real, imag);


