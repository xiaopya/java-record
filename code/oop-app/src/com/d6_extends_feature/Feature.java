package com.d6_extends_feature;

/**
 * 继承的特征
 */
public class Feature {

}

/* 继承支持多层继承，但不支持多继承 */
// 以下是多层继承 是可以的
class A extends Feature{

}
class B extends A{

}

// 以下是多继承，是不行的
// class C extends A,B{
//
// }




