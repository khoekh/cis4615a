/* Rule 07: OBJ09-J. Compare classes and not class names
Description: Vulnerable to mix/match attack because class
loaders can load differing classes
Ver: NC
*/

 // Determine whether object auth has required/expected class object
 if (auth.getClass().getName().equals(
      "com.application.auth.DefaultAuthenticationHandler")) {
   // ...
}
