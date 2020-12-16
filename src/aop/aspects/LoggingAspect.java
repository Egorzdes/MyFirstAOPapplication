package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook())") // это PointCut *выражение описывающее,
    // где должен быть применен Advice*

    public void beforeGetBookAdvice(){ // Advice это метод который определяет
        // что должно произойти при вызове метода в нашем случае - getBook
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

}
