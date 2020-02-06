package com.showingapp.kotlinbasics;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;

public class JavaToKotlin {

    public static void main(String[] args) {
        KotlinToJava obj = new KotlinToJava(true, 32);

        obj.setMarried(false); //when is is used as property name...is is replaces by set only for var type property

        RectangleClass rectClass = new RectangleClass(4,3);
        System.out.println(rectClass.isSquare());
    }
}
