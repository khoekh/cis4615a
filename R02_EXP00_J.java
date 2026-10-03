// Rule 02. Expressions (EXP)
// IDS03-J: Do not ignore values returned by methods
// Description: Deletes files withut checking operation success.
// Version: NON-COMPLIANT

public void deleteFile(){

  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();

}
