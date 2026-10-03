/* Rule 06: MET01-J. Never use assertions to validate method arguments
Description: Validates the method arguments by ensuring that values passed
to Math.abs() exclude Integer.MIN_VALUE and also checks for integer overflow
Version: Compliant
*/

public static int getAbsAdd(int x, int y) {
  if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
    throw new IllegalArgumentException();
  }
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  if (absX > Integer.MAX_VALUE - absY) {
    throw new IllegalArgumentException();
  }
  return absX + absY;
}
