package models;

import lombok.*;

@AllArgsConstructor
@Data
@Builder
public class Account {
    String accountName;
    String parentAccount;
    String phone;
    String webSite;

    String type;
    String industry;
    String employees;
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

    public String getBillingAddress() {
        return getBillingStreet() + "\n" + getBillingCity() + ", " + getBillingState() + " " + getBillingZip() + "\n" + getBillingCountry();
    }

    public String getShippingAddress() {
        return getShippingStreet() + "\n" + getShippingCity() + ", " + getShippingState() + " " + getShippingZip() + "\n" + getShippingCountry();
    }
}


