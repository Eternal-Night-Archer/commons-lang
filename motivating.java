// ApcomplexMath.java
public static Apcomplex pow(Apcomplex z, Apcomplex w)
throws ApfloatRuntimeException {
  Apcomplex result = ApfloatHelper.checkPow(
    z, w, Math.min(z.precision(), w.precision()));
  if (result != null) {
    return result;
  } else if (z.real().signum() >= 0 &&
             z.imag().signum() == 0) {
    Apfloat x = z.real();
    Apfloat one = new Apfloat(
      1L, Long.MAX_VALUE, x.radix());
    x = // ignore some code
    return exp(w.multiply(ApfloatMath.log(x)));
  } else {
    return exp(w.multiply(log(z)));
  }
}


