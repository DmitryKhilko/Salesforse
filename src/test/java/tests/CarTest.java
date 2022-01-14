package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {
    @Test
    public void carTest(){
        log.info(">>>>>>>>>> Старт теста carTest");
        log.debug(">>>>>>>>>> Создается объект car1");
        Car car1 = new Car("BMW","X5",160); //объект создаваемый на базе конструктора для всех переменных
        log.debug(">>>>>>>>>> Создается объект car2");
        Car car2 = new Car("BMW","X5",160);
        log.debug(">>>>>>>>>> Создается объект car3");
        Car car3 = new Car(); //объект, создаваемый на базе конструктора без переменных
        log.debug(">>>>>>>>>> Объекту car3 присваивются значения производителя, модели, скорости");
        car3.setMake("BMW");
        car3.setModel("X5");
        car3.setMaxSpeed(160);

        log.debug(">>>>>>>>>> Создается объект car4");
        Car car4 = new Car("BMW");

        log.debug(">>>>>>>>>> Создается с помощью билдера объект car5");
        Car car5 = Car.builder()
                .make("BMW")
                .model("X5")
                .maxSpeed(160)
                .build();

        log.debug(">>>>>>>>>> Создается с помощью паттерна 'фабрика' объект car6");
        Car car6 = CarFactory.get();
        log.debug(">>>>>>>>>> Создается с помощью паттерна 'фабрика' объект car6");
        Car car7 = CarFactory.get1();

//        log.info("!!!!");
//        log.debug("!!!!");
//        log.error("!!!!");
//        log.fatal("!!!!");


        log.debug(">>>>>>>>>> Сравнивается объект car1 и car2");
        assertEquals(car1, car2,"Автомобили не равны");
        log.debug(">>>>>>>>>> Сравнивается объект car2 и car3");
        assertEquals(car2, car3,"Автомобили не равны");
        log.debug(">>>>>>>>>> Сравнивается объект car3 и car5");
        assertEquals(car3, car5,"Автомобили не равны");
//        assertEquals(car5, car6,"Автомобили не равны");
//        assertEquals(car1, car7,"Автомобили не равны");
        log.info(">>>>>>>>>>Завершение теста carTest");



    }
}
