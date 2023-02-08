package softuni.examprepbattleships.validations.checkShipExistence;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ShipExistenceValidator.class)
public @interface ValidateExistenceOfShip {

    String message() default "Ship name is taken";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
