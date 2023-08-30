

/**
 * Class administrator
 */
public class administrator {

  //
  // Fields
  //

  private String username;
  private String password;
  
  //
  // Constructors
  //
  public administrator () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of username
   * @param newVar the new value of username
   */
  private void setUsername (String newVar) {
    username = newVar;
  }

  /**
   * Get the value of username
   * @return the value of username
   */
  private String getUsername () {
    return username;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  private void setPassword (String newVar) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  private String getPassword () {
    return password;
  }

  //
  // Other methods
  //

  /**
   */
  public void set_party()
  {
  }


  /**
   */
  public void set_contesant()
  {
  }


  /**
   */
  public void collate_vote()
  {
  }


}



/**
 * Class voting
 */
public class voting {

  //
  // Fields
  //

  private String reg_number;
  private object fingerprint;
  
  //
  // Constructors
  //
  public voting () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of reg_number
   * @param newVar the new value of reg_number
   */
  private void setReg_number (String newVar) {
    reg_number = newVar;
  }

  /**
   * Get the value of reg_number
   * @return the value of reg_number
   */
  private String getReg_number () {
    return reg_number;
  }

  /**
   * Set the value of fingerprint
   * @param newVar the new value of fingerprint
   */
  private void setFingerprint (object newVar) {
    fingerprint = newVar;
  }

  /**
   * Get the value of fingerprint
   * @return the value of fingerprint
   */
  private object getFingerprint () {
    return fingerprint;
  }

  //
  // Other methods
  //

  /**
   */
  public void login()
  {
  }


  /**
   */
  public void vote()
  {
  }


}
