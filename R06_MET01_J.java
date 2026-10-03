/* Rule 06: MET01-J. Never use assertions to validate method arguments
Description: Produces incorrect results because of integer overflow or 
when either or both of its arguments are Integer.MIN_VALUE
Version: Noncompliant
*/

public static int getAbsAdd(int x, int y) {
  return Math.abs(x) + Math.abs(y);
}
getAbsAdd(Integer.MIN_VALUE, 1);
