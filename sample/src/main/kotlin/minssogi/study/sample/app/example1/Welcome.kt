package minssogi.study.sample.app.example1

import minssogi.study.sample.utils.CommonUtil.printPretty
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Welcome {

    @GetMapping("/welcome")
    fun welcome() : ResponseEntity<String> {

        printPretty() // java class call

        return ResponseEntity.ok("welcome")
    }
}