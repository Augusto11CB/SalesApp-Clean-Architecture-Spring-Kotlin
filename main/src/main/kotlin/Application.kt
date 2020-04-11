import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@EnableJpaRepositories(basePackages = ["api.infrastructure.db"])
//@EntityScan("api.infrastructure.db")
@SpringBootApplication(scanBasePackages = ["clean.archt.spring.studies.sales.app"])
class Application {

    fun main(args: Array<String>) {
        runApplication<Application>(*args)
    }

}