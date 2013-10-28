package com.novoda.gradle.test

class MainActivitySpec extends RoboSpecification {

    def "inflates layout"() {
        expect:
        MainActivity activity = new MainActivity()

        when:
        activity.onCreate(null)

        then:
        activity.findViewById(com.novoda.gradle.test.R.id.text) != null
    }
}