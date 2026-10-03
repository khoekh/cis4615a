/* Rule 04: STR03-J. Do not encode noncharacter data as a string
Description: Noncharacter data may not be representable as a string, because
not all bit patterns represent valid characters in most character sets.
Consequently, programmers must not convert noncharacter data to a string.
Version: NON-COMPLIANT
*/

BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
