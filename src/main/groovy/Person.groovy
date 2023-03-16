import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

@Canonical
@EqualsAndHashCode
class Person implements Serializable {
    String name
    Integer age
}
