// Rule 03. Numeric Types and Operations (NUM)
// NUM03-J: Use integer types that can fully represent the possible range of unsigned data
// Description: Generic method is used to read integer data
// Version: NON-COMPLIANT

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt();  
}
