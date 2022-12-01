import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstBean =
                (Cat) applicationContext.getBean("cat");
        Cat secondBean =
                (Cat) applicationContext.getBean("cat");

        boolean firstCompare = bean == bean2;
        boolean secondCompare = firstBean == secondBean;
        System.out.println(firstCompare);
        System.out.println(secondCompare);
        //System.out.println(bean.getMessage());

    }
}