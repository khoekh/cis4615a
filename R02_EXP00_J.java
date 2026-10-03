// Rule 02. Expressions (EXP)
// IDS03-J: Do not ignore values returned by methods
// Description: Handles by checking boolean value.
// Version: COMPLIANT

public void deleteFile(){

  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }

}
