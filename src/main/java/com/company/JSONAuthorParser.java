package com.company;

public class JSONAuthorParser {

  private String auth_name;
  private String auth_email;
  private String auth_url;

  //Setters for the JSON Parser to utilize for all three parts of an author's data
  protected void setAuth_name(String betaName) {
    this.auth_name = betaName;
  }

  protected void setAuth_email(String betaEmail) {
    this.auth_email = betaEmail;
  }

  protected void setAuth_url(String betaUrl) {
    this.auth_url = betaUrl;
  }

  //Getters for the JSON Parser to utilize for all three parts of an author's data
  protected String getAuth_name() {
    return auth_name;
  }

  protected String getAuth_email() {
    return auth_email;
  }

  protected String getAuth_url() {
    return auth_url;
  }
}
