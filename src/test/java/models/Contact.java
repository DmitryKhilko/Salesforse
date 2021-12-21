package models;

public class Contact {
    String phone;
    String salutation;
    String firstName;
    String lastName;
    String mobile;
    String accountName;
    String email;
    String title;
    String reportsTo;

    String mailingStreet;
    String mailingCity;
    String mailingState;
    String mailingZip;
    String mailingCountry;

    String otherStreet;
    String otherCity;
    String otherState;
    String otherZip;
    String otherCountry;

    String fax;
    String department;
    String homePhone;
    String leadSource;
    String otherPhone;
    String birthdate;
    String asstPhone;
    String assistant;
    String Description;

    public Contact(String phone, String salutation, String firstName, String lastName, String mobile, String accountName, String email, String title, String reportsTo, String mailingStreet, String mailingCity, String mailingState, String mailingZip, String mailingCountry, String otherStreet, String otherCity, String otherState, String otherZip, String otherCountry, String fax, String department, String homePhone, String leadSource, String otherPhone, String birthdate, String asstPhone, String assistant, String description) {
        this.phone = phone;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.accountName = accountName;
        this.email = email;
        this.title = title;
        this.reportsTo = reportsTo;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.mailingZip = mailingZip;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherZip = otherZip;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.department = department;
        this.homePhone = homePhone;
        this.leadSource = leadSource;
        this.otherPhone = otherPhone;
        this.birthdate = birthdate;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        Description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingZip() {
        return mailingZip;
    }

    public void setMailingZip(String mailingZip) {
        this.mailingZip = mailingZip;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public void setOtherZip(String otherZip) {
        this.otherZip = otherZip;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return getSalutation() + " " + getFirstName() + " " + getLastName();
    }

    public String getMailingAddress() {
        return getMailingStreet() + "\n" + getMailingCity() + ", " + getMailingState() + " " + getMailingZip() + "\n" + getMailingCountry();
    }

    public String getOtherAddress() {
        return getOtherStreet() + "\n" + getOtherCity() + ", " + getOtherState() + " " + getOtherZip() + "\n" + getOtherCountry();
    }
}
