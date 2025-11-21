package singleTonDP;

import java.io.Serializable;

public class SingleTonPatternLazy implements Serializable , Cloneable{

    private static SingleTonPatternLazy singleTonPatternLazy;
    // constructor should be private in Singleton
    private SingleTonPatternLazy() {

        if (singleTonPatternLazy != null) {
            throw new RuntimeException("your trying to break rule huhh");
        }
    }

    // Lazy way of creating single object >

    public static SingleTonPatternLazy getInstance() {
        // for single time execution >
        // And Thread Safe environment >
        if (singleTonPatternLazy == null) {

            synchronized (SingleTonPatternLazy.class) {
                if (singleTonPatternLazy == null) {
                    singleTonPatternLazy = new SingleTonPatternLazy();
                }
            }
        }
        return singleTonPatternLazy;
    }

    // Deserialization problem == solved by >
//    public Object readResolve() {
//        return singleTonPatternLazy;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
