package models;

public class Account {
    String accountName;
    String parentAccount;
    String phone;
    String fax;
    String webSite;

    String type;
    String industry;
    String employees;
    String annualRevenue;
    String description;

    String billingStreet;
    String billingCity;
    String billingState;
    String billingZip;
    String billingCountry;

    String shippingStreet;
    String shippingCity;
    String shippingState;
    String shippingZip;
    String shippingCountry;

    public Account(String accountName, String parentAccount, String phone, String fax, String webSite, String type, String industry, String employees, String annualRevenue, String description, String billingStreet, String billingCity, String billingState, String billingZip, String billingCountry, String shippingStreet, String shippingCity, String shippingState, String shippingZip, String shippingCountry) {
        this.accountName = accountName;
        this.parentAccount = parentAccount;
        this.phone = phone;
        this.fax = fax;
        this.webSite = webSite;
        this.type = type;
        this.industry = industry;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.shippingStreet = shippingStreet;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;
        this.shippingCountry = shippingCountry;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public void setParentAccount(String parentAccount) {
        this.parentAccount = parentAccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getBillingAddress() {
        return getBillingStreet() + "\n" + getBillingCity() + ", " + getBillingState() + " " + getBillingZip() + "\n" + getBillingCountry();
    }

    public String getShippingAddress() {
        return getShippingStreet() + "\n" + getShippingCity() + ", " + getShippingState() + " " + getShippingZip() + "\n" + getShippingCountry();
    }
}


