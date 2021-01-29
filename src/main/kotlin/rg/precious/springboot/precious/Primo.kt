package rg.precious.springboot.precious

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/one")
class Primo {
    @GetMapping
     fun first():String = "hhh"

}