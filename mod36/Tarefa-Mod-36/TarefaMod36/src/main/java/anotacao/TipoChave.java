/**
 * 
 */
package anotacao;

/**
 * @author Rômulo
 *
 */
import java.lang.annotation.*;

/**
 * @author rodrigo.pires
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}