package com.five.animailss.aop;
import com.five.animailss.constant.Constant;
import com.github.pagehelper.PageHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//                     .::::::::.
//                    :::::::::::
//                 ..:::::::::::'
//              '::::::::::::'
//                .::::::::::
//           '::::::::::::::..
//                ..::::::::::::.
//              ``::::::::::::::::
//               ::::``:::::::::'        .:::.
//              ::::'   ':::::'       .::::::::.
//            .::::'      ::::     .:::::::'::::.
//           .:::'       :::::  .:::::::::' ':::::.
//          .::'        :::::.:::::::::'      ':::::.
//         .::'         ::::::::::::::'         ``::::.
//     ...:::           ::::::::::::'              ``::.
//    ```` ':.          ':::::::::'                  ::::..
//                       '.:::::'                    ':'````..
//切面类，主要封装了分页操作中的前置操作：对pageNum和pageSize的判断
//也封装了后置操作:对数据库查询返回的list集合进行封装成pageInfo对象
//

//一定在扫描的包下
@Component
@Aspect
public class PageAspector {
	// 在@Pointcut中定义切入点，然后在@Around和其他的通知中复用
	// 我们的切入点应该是所有的service中带有分页的方法，带有分页的方法需要有以下特点
	// 1所有service中方法名以List结尾的（要求:方法的命名尽量的规范）
	// 2方法的参数，前两个是一定是字符串类型的，后面参数的个数不限制
	@Pointcut("execution(* com.five.animailss.service.impl.*.*List(java.lang.String,java.lang.String,..))")
	public void pointcut() {
	}
	// 也可以直接在通知中定义切入点
	// 方法的返回值要求1可以对返回的值的数据进行修改2但是保证代理对象方法的返回类型和被代理对象的返回类型保持一致
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//		System.out.println("环绕的前置操作");
		// 获取目标方法的参数
		Object[] params = joinPoint.getArgs();
		String pageNum = (String) params[0];
		String pageSize = (String) params[1];
		// 指定pageNum和pageSize的默认值
		int pageNumInt = 0;
		int pageSizeInt = 0;
		if (pageNum == null || pageNum.length() == 0) {
			pageNumInt = Constant.PAGENUM;
		} else {
			pageNumInt = Integer.valueOf(pageNum);
		}
		if (pageSize == null || pageSize.length() == 0) {
			pageSizeInt = Constant.PAGESIZE;
		} else {
			pageSizeInt = Integer.valueOf(pageSize);
		}
		System.out.println(pageNumInt+"aaa"+pageSizeInt);
		// 根据chcDueId=当前传递的用户id进行查询
		PageHelper.startPage(pageNumInt, pageSizeInt);
		// 默认@Around通知是阻塞目标方法的调用
		// joinPoint是连接点，也就是切入点
		// proceed表示调用目标方法,并且返回目标方法执行的返回值
		Object obj = joinPoint.proceed(params);
		System.out.println("aaaaa");
		return obj;
	}

}

