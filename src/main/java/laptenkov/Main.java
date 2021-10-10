package laptenkov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
                JavaSpringConfiguration.class);

        MusicBox musicBox = configApplicationContext.getBean("musicBox", MusicBox.class);
        musicBox.play();
    }
}
