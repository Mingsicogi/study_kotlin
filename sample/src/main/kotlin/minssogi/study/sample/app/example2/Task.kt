package minssogi.study.sample.app.example2

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/task")
class Task {

    @GetMapping("/fast")
    fun fast() : ResponseEntity<String> {

        val taskTime = Random.nextInt(100, 500)

        val processingMessage = "task processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(processingMessage)
    }

    @GetMapping("/long")
    fun long() : ResponseEntity<String> {

        val taskTime = Random.nextInt(1000, 2000)

        val processingMessage = "task processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(processingMessage)
    }

    @GetMapping("/veryLong")
    fun veryLong() : ResponseEntity<String> {

        val taskTime = Random.nextInt(2000, 5000)

        val processingMessage = "task processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(processingMessage)
    }
}