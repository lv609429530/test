package jarTest;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class jarOftest {

    String A = "正确";
    String B = "错误";

    public String test(int data) throws Exception{
        log.info("本次请求参数是:{}",data);
       if (data<5){
           return A;
        }
        if (data>5){
            return B;
        }
        if (data==5){
            log.info("the data can not equal '5' ");
            return "失败";
        }
       return "系统内部异常";
    }

}
