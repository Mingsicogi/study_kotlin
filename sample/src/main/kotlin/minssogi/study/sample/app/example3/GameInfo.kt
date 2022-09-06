package minssogi.study.sample.app.example3

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/game")
class GameInfo {

    @GetMapping("/getGameInfo")
    fun fast(): ResponseEntity<Game> {

        val taskTime = 500

        val processingMessage = "getGameInfo processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(Game("HIT2", "히트 투"))
    }

    @GetMapping("/getCharacterInfo")
    fun getCharacterInfo(): ResponseEntity<Character> {

        val taskTime = 1000

        val processingMessage = "getCharacterInfo processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(Character("밍빵디", 99))
    }

    @GetMapping("/getPaymentInfo")
    fun veryLong(): ResponseEntity<GamePaymentInfo> {

        val taskTime = 3000

        val processingMessage = "getPaymentInfo processing... it will be done after ${taskTime / 1000.0}s"
        println(processingMessage)
        Thread.sleep(taskTime * 1L) // task processing... ...

        return ResponseEntity.ok(GamePaymentInfo(500_000_000))
    }

    class Character(val nickname: String, val level: Int)
    class Game(val gameCode: String, val gameName: String)
    class GamePaymentInfo(val total: Int)
}