package sos;

public class Parser {

  /**
   * Return an integer representing the number of letters changed in the SOS message during
   * transmission.
   *
   * @param signal The signal as received on Earth
   * @return changes
   */
  public int calculateChanges(String signal) {
    int changes = 0;
    for (int i = 0; i < signal.length(); i++) {
      char character = signal.toUpperCase().charAt(i);

      if ((i + 1) % 3 == 1 && character != 'S') {
        changes += 1;
      }

      if ((i + 1) % 3 == 2 && character != 'O') {
        changes += 1;
      }

      if ((i + 1) % 3 == 0 && character != 'S') {
        changes += 1;
      }
    }

    return changes;
  }
}
