// Rule 00. Input Validation and Data Sanitization (IDS)
// IDS03-J: Do not log unsanitized user input
// Description: Logging unsanitized user input can be subjected to log injection attacks.
// Noncompliant

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}
