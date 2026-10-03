/* Rule 07: OBJ09-J. Compare classes and not class names
Description: the comparison is correctly performed on the two class objects.
Ver: C
*/

 // Determine whether object auth has required/expected class name
 if (auth.getClass() == com.application.auth.DefaultAuthenticationHandler.class) {
   // ...
}

// Determine whether objects x and y have the same class
if (x.getClass() == y.getClass()) {
  // Objects have the same class
}

