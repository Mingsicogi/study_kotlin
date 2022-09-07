package minssogi.study.sample.app.example3

import lombok.NoArgsConstructor

class GameDTO {

    companion object{
        open class GameInfo(gameCode: String, gameName: String) {
            constructor() : this("", "")

        }
        open class CharacterInfo(nickname: String, level: Int): GameInfo()
        class PaymentInfo(total: Int): CharacterInfo("밍빵디", 99)
    }
}