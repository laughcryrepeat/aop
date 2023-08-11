package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {

    //hello.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() { //join point 시그니처
    }

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() { //join point 시그니처
    }

    // allOrder and allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}

}
