package br.com.carsapi.usuario.beansvalidationcriadas;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = { ExisteObjetoValidator.class})
@Target({FIELD})
@Retention(RUNTIME)
public @interface ExisteObjeto {

	String message() default "Nao existe objeto cadastrado no banco de dados com Id passado";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	String fieldName();
	
	Class<?> domainClass();

}
