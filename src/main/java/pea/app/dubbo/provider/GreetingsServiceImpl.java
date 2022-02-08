package pea.app.dubbo.provider;

import pea.app.dubbo.api.GreetingService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class GreetingsServiceImpl implements GreetingService {

  @Override
  public String sayHello(String name) {
    System.out.println("receive:"+name);
    return "hi, " + name;
  }
}
