package rg.precious.springboot.precious

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PreciousApplication

fun main(args: Array<String>) {
	runApplication<PreciousApplication>(*args)
}
