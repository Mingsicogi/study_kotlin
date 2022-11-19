package minssogi.study.study_kotlin.asynchronous_programming

import lombok.NoArgsConstructor
import lombok.ToString

@NoArgsConstructor
class Item(private val name: String, private val price: Int) {

    override fun toString(): String {
        return "name=$name, price=$price"
    }
}
