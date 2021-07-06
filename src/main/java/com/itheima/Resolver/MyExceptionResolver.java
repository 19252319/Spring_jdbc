package com.itheima.Resolver;

import com.itheima.exception.MyException;
import com.itheima.interceptor.MyInterceptor1;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof MyException){
            modelAndView.addObject("info","自定义的异常！");
        }else if(e instanceof ClassCastException){
            modelAndView.addObject("info","类转换异常！");
        }else{
            modelAndView.addObject("info","其他异常！");
        }
        modelAndView.setViewName("error2");
        return modelAndView;
    }
}
