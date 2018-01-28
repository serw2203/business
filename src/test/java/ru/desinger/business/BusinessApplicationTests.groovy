package ru.desinger.business

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

/******************************************************************
 Created by : serw  28.01.2018 13:30
 ******************************************************************/
@SpringBootTest(classes = BusinessApplication.class)
class BusinessApplicationTests extends Specification {

    @Autowired
    WebApplicationContext context

    def "Первый тест на spock"() {
        when: context != null
        then: println("DONE !!!")
    }
}
