/* This kata is about multiplying a given number by eight if it is an even number and by nine otherwise./*  */

fun simpleMultiplication(n: Int): Int {
  if(n % 2 == 0) {
      return n * 8
  } else {
      return n * 9
  }
}

// fun simpleMultiplication(n: Int): Int {
//   return n * (8 + n%2);
// }
