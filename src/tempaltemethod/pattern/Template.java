package tempaltemethod.pattern;

/** 模板方法模式：定義一個操作中算法的框架，將一些步驟延遲到子類實現，使得子類
 * 可以不改變一個算法的框架而重定義該該算法的某些特定步驟
 *          AbstractClass
 *              *
 *              *
 *              *
 *  ConcreteClass1    ConcreteClass2
 *  為了防止惡意操作，一般定義為模板方法都加上final關鍵字，不允許被複寫
 *  而那些讓子類實現的方法限定為protected比較好
 * */
public class Template {

}
