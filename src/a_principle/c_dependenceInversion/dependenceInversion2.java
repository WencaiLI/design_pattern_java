package a_principle.c_dependenceInversion;

public class dependenceInversion2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receiver(new Email1());
        person1.receiver(new WeChat());
        person1.receiver(new Sms());
    }
}

interface IReceiver{
    String getInfo();
}

class Email1 implements IReceiver{

    @Override
    public String getInfo() {
        return "接受邮件信息";
    }
}

// 增加微信消息
class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "接受微信消息";
    }
}

// 增加短信
class Sms implements IReceiver{

    @Override
    public String getInfo() {
        return "接受短信消息";
    }
}


class Person1{
    public void receiver(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
// 除了接口实现依赖传递，还可以使用构造器和setter的方式实现依赖传递，这里不多做赘述