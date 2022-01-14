package tests;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

import java.sql.Timestamp;
import java.util.Date;

@Log4j2
public class CarFactory {

    static Faker faker = new Faker();
    public static Car get1(){
        Date date = new Date();
        log.debug(">>>>>>>>>>Создается объект Car c faker");
        return Car.builder()
                .make(faker.pokemon().name() + new Timestamp(date.getTime()))
                .model("X5")
                .maxSpeed(160)
                .build();
    }

    public static Car get(){
        log.debug(">>>>>>>>>>Создается объект Car c предустановленными значениями");
        return Car.builder()
                .make("BMW")
                .model("X5")
                .maxSpeed(160)
                .build();
    }
}
