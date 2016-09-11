package burrows.apps.example.template.activity

import android.os.Build
import burrows.apps.example.template.BuildConfig
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import org.robospock.GradleRoboSpecification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@Config(constants = BuildConfig, sdk = Build.VERSION_CODES.LOLLIPOP)
class MainActivitySpec extends GradleRoboSpecification {

    def "activity should not be null"() {
        when:
        def mainActivity = Robolectric.setupActivity(MainActivity)

        then:
        mainActivity != null
    }
}
