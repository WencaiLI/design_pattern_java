package a_principle.c_dependenceInversion;

public class dependenceInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello word! ";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
// 缺点：在接收比如微信消息，短信等需要新创建类和新增Person方法
// 方案：引入抽象接口IReceive，各自实现接口就OK，这样就符合依赖倒转原则