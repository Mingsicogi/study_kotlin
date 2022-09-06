package minssogi.study.sample.app.example1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bye {

    @GetMapping("/bye")
    public ResponseEntity<String> bye() {
        return ResponseEntity.ok("bye");
    }
}
