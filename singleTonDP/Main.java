package singleTonDP;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

//        singleTonDP.SingleTonPatternLazy instance1 = singleTonDP.SingleTonPatternLazy.getInstance();
//        singleTonDP.SingleTonPatternLazy instance2 = singleTonDP.SingleTonPatternLazy.getInstance();
//
//        // same object anyway
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());

        // Breaking of SingleTon Pattern >
        /*

        1. REFLECTION API !
        >  Solution  1. If object is there then > throw exception from ind=side constructor .
                     2. Use Enum
                     3. DESERIALIZATION >
                     solution > @ Implementing ReadResolve Method >

                     4. Object Cloning (
                       >> .clone()
                       >> Implement Cloneable Interface)

        */

//        Constructor<singleTonDP.SingleTonPatternLazy> declaredConstructor = singleTonDP.SingleTonPatternLazy.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//
//        singleTonDP.SingleTonPatternLazy singleTonPatternLazy = declaredConstructor.newInstance();
//        System.out.println(singleTonPatternLazy.hashCode());

//        singleTonDP.EnumSingleTon s1 = singleTonDP.EnumSingleTon.INSTANSE;
//        System.out.println(s1.hashCode());
//
//        Constructor<singleTonDP.EnumSingleTon> constructor = singleTonDP.EnumSingleTon.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        singleTonDP.EnumSingleTon s2 = constructor.newInstance();

        // **** DESERIALIZATION ***
//        singleTonDP.SingleTonPatternLazy singleTonPatternLazy = singleTonDP.SingleTonPatternLazy.getInstance();
//
//        System.out.println(singleTonPatternLazy.hashCode());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(singleTonPatternLazy);
//
//        System.out.println("serialization done ...");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        singleTonDP.SingleTonPatternLazy singleTonPatternLazy1 = (singleTonDP.SingleTonPatternLazy) ois.readObject();
//
//        System.out.println(singleTonPatternLazy1.hashCode());


        // Cloneable >

        SingleTonPatternLazy instance1 = SingleTonPatternLazy.getInstance();

        SingleTonPatternLazy instance2 = (SingleTonPatternLazy) instance1.clone();
    }
}
