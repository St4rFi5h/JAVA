package oop.method.test;

import oop.method.sample.OverloadingSample;

public class TestOverloading {
 public static void main (String [ ] args) {
 OverloadingSample osamp = new OverloadingSample( );
 osamp.out ( );
 osamp.out (1,2,3,4);
 osamp.out (1,2,3,4,5,6,7,8,9);
}
}