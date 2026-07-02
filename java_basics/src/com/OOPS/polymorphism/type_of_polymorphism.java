package com.OOPS.polymorphism;

public class type_of_polymorphism {

    //compile time?static polymorphism --> achieved via method overloading --> same name but diff return type , ordering etc can be diff --> eg: multiple constructor


    //runtime/dynamic polymorphism --> acheived by method overridding -->
    //    parent obj = new child()
    //                        ^
    //                        |
    // hence which method will be called depends on child .this is called upcasting  ---> thats how overriding works

    // we can prevent overridding using word called final
    //final will always run at time of conflicting
    //early binding
    //final void area(){
    // System.out.println("i am in shapes");
    //}

}
/*
 * 1. Compile-Time Polymorphism (Static Polymorphism)
 * --------------------------------------------------
 * Achieved using Method Overloading.
 *
 * Same method name but different:
 * - Number of parameters
 * - Type of parameters
 * - Order of parameters
 *
 * NOTE:
 * Return type alone CANNOT be different.
 *
 * Example:
 * add(int a, int b)
 * add(double a, double b)
 *
 * Constructor overloading is also an example.
 */


/*
 * 2. Runtime Polymorphism (Dynamic Polymorphism)
 * ----------------------------------------------
 * Achieved using Method Overriding.
 *
 * Parent obj = new Child();
 *
 * Example:
 * Shape obj = new Circle();
 *
 * Here the reference type is Parent (Shape),
 * but the object is Child (Circle).
 *
 * Which overridden method executes depends on
 * the actual object (Child), not the reference.
 *
 * This is called Dynamic Method Dispatch.
 * The conversion Parent obj = new Child()
 * is called Upcasting.
 */


/*
 * Preventing Method Overriding
 * ----------------------------
 * Use the 'final' keyword.
 *
 * final void area() {
 *     System.out.println("I am in Shape");
 * }
 *
 * A final method cannot be overridden by subclasses.
 */


/*
 * Binding
 * -------
 * Method Overloading  -> Early Binding (Compile Time)
 * Method Overriding   -> Late Binding (Runtime)
 */
