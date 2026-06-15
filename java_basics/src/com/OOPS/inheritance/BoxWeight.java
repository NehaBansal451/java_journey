package com.OOPS.inheritance;


// to add all properties of Box class we use extend
//it will add all properties in BoxWeight
// it will not access the private member of parent class
public class BoxWeight extends Box {
      double weight;

      public BoxWeight(){
          super();//call constructor just above it
          this.weight = -1;
      }

      BoxWeight(BoxWeight other) {
          super(other);
          weight = other.weight;
      }

      public BoxWeight(double l , double h , double w , double weight){
          super(l , h , w); // call the present class constructor
          //used to initialise values present in parent class

          //we can super to explicity call from box
           System.out.println(super.h);

          this.weight = weight;
      }
}
  // we can use final to prevent inheritance
  // if we write final at Box then Boxweight can not inherit  Box properties
  //but static properities can be inherited , also ca not be overridden because it does not depend on object