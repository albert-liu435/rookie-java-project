package com.rookie.bigdata.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname MyAnnotation
 * @Description https://www.cnblogs.com/CF1314/p/16580232.html
 * https://blog.csdn.net/wgzblog/article/details/125689186
 * 注解可以看作是一种特殊的标记，可以用在方法、类、参数和包上，程序在编译或者运行时可以检测到这些标记而进行一些特殊的处理，例如标注在方法上可以实现接口权限的校验。
 * 注解的元素类型
 * 主要有@Target，@Retention,@Document,@Inherited 用来修饰注解。
 *
 * @Author rookie
 * @Date 2021/10/22 16:51
 * @Version 1.0
 */
// 可以作用在 构造方法、方法、方法形参、属性、注解类型 上
//@Target注解，是专门用来限定某个自定义注解能够被应用在哪些Java元素上面的，标明作用范围；取值在java.lang.annotation.ElementType 进行定义的。

//ElementType.TYPE	应用于类、接口（包括注解类型）、枚举
//ElementType.FIELD	应用于属性（包括枚举中的常量）
//ElementType.METHOD	应用于方法
//ElementType.PARAMETER	应用于方法的形参
//ElementType.CONSTRUCTOR	应用于构造函数
//ElementType.LOCAL_VARIABLE	应用于局部变量
//ElementType.ANNOTATION_TYPE	应用于注解类型
//ElementType.PACKAGE	应用于包
//ElementType.TYPE_PARAMETER	1.8版本新增，应用于类型变量）
//ElementType.TYPE_USE	1.8版本新增，应用于任何使用类型的语句中（例如声明语句、泛型和强制转换语句中的类型）

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
//RetentionPolicy.SOURCE	编译时被丢弃，不包含在类文件中
//RetentionPolicy.CLASS	JVM加载时被丢弃，包含在类文件中，默认值
//RetentionPolicy.RUNTIME	由JVM 加载，包含在类文件中，在运行时可以被获取到
@Retention(RetentionPolicy.RUNTIME)
//@Documented
//表明该注解标记的元素可以被Javadoc 或类似的工具文档化。
//
//2.4、@Inherited
//表明使用了@Inherited注解的注解，所标记的类的子类也会拥有这个注解
public @interface MyAnnotation {

    String[] value() default "张三";


}
