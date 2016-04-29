package burrows.apps.example.template.activity

import org.robolectric.Robolectric
import org.robospock.GradleRoboSpecification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 * @since 0.0.1
 */
class MainActivitySpec extends GradleRoboSpecification {


    def "activity should not be null"() {
        when:
        def mainActivity = Robolectric.setupActivity(MainActivity)

        then:
        mainActivity != null
    }
}
