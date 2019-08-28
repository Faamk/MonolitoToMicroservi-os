package tech.gibb.monolith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@SpringBootApplication
public class MonolithApplication {

    private Random random = new Random();

    @RequestMapping("/service/randomfortune")
    public String fortune() {
        int idx = random.nextInt(FORTUNES.length);
        String fortune = FORTUNES[idx];
        return fortune;
    }

    @RequestMapping("/service/hello")
    public String hello(@RequestParam String name) {
        return "Olá " + name;
    }

    private static final String[] FORTUNES = new String[] {
            "A vida trará coisas boas se tiver paciência.",
            "Demonstre amor e alegria em todas as oportunidades e verá que a paz nasce dentro de si.",
            "Não compense na ira o que lhe falta na razão.",
            "Defeitos e virtudes são apenas dois lados da mesma moeda.",
            "A maior de todas as torres começa no solo.",
            "Você não pode amar sua vida até viver a vida que ama.",
            "Não há que ser forte. Há que ser flexível.",
            "Todos os dias organiza os seus cabelos, por que não faz o mesmo com o coração?",
            "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.",
            "A juventude não é uma época da vida, é um estado de espírito",
            "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.",
    };

    public static void main(String[] args) {
        SpringApplication.run(MonolithApplication.class, args);
    }
}