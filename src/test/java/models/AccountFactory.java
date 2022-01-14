package models;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {
    static Faker faker = new Faker();

    public static Account get(String parentAccount, String type, String industry, String employees, String description){
        log.info("Заполняем поля диалогового окна создания нового аккаунта:");
        return Account.builder()
                .accountName(faker.pokemon().name())
                .parentAccount(parentAccount)
                .phone(faker.phoneNumber().phoneNumber())
                .webSite(faker.internet().url())
                .type(type)
                .industry(industry)
                .employees(employees)
                .description(description)
                .billingStreet(faker.address().streetAddress())
                .billingCity(faker.address().city())
                .billingState(faker.address().state())
                .billingZip(faker.address().zipCode())
                .billingZip(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingStreet(faker.address().streetAddress())
                .shippingCity(faker.address().city())
                .shippingState(faker.address().state())
                .shippingZip(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .build();
    }
}
