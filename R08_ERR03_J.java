/* Rule 08: ERR03-J. Restore prior object state on method failure
Desc: security-critical objects must —be maintained in a consistent 
state even when exceptional conditions arise.
Version: Compliant
*/

protected int getVolumePackage(int weight) {
  length += PADDING;
  width  += PADDING;
  height += PADDING;
  try {
    if (length <= PADDING || width <= PADDING || height <= PADDING ||
      length > MAX_DIMENSION + PADDING || 
      width > MAX_DIMENSION + PADDING || 
      height > MAX_DIMENSION + PADDING || 
      weight <= 0 || weight > 20) {
      throw new IllegalArgumentException();
    }

    int volume = length * width * height;
    return volume;
  } catch (Throwable t) {
    MyExceptionReporter mer = new MyExceptionReporter();
    mer.report(t); // Sanitize
    return -1; // Non-positive error code
  } finally {
    // Revert
    length -= PADDING; width -= PADDING; height -= PADDING; 
  }
}

