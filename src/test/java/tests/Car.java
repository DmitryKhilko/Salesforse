package tests;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor //конструктор для всех переменных
@NoArgsConstructor // конструктор без переменных
@RequiredArgsConstructor //конструктов для переменных с аннотацией @NonNull
@Data
@Builder
@Log4j2
public class Car {
    @NonNull
    String make;
    String model;
    int maxSpeed;
}
