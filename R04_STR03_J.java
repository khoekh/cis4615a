/* Rule 04: STR03-J. Do not encode noncharacter data as a string
Description: Contains valid character data in the default character set.
Version: COMPLIANT
*/

BigInteger x = new BigInteger("530500452766");
String s = x.toString();  // Valid character data
byte[] byteArray = s.getBytes();
String ns = new String(byteArray);  
x = new BigInteger(ns);
