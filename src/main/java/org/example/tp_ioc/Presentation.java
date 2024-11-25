package org.example.tp_ioc;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication @AllArgsConstructor
public class Presentation {

    private IMetier metier;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Presentation.class, args);
        Presentation app = context.getBean(Presentation.class);
        app.run();
    }

    public void run() {
        System.out.println("Le résultat du calcul est : " + metier.calcul());
    }
}
