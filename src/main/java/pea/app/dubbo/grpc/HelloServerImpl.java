package pea.app.dubbo.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import pea.grpc.Hello;
import pea.grpc.HelloServiceGrpc;

@GRpcService
public class HelloServerImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Hello.HelloResponse> responseObserver) {
        String greeting = request.getGreeting();
        System.out.println("HelloServerImpl收到客户端的:" + greeting);
        Hello.HelloResponse rp = Hello.HelloResponse.newBuilder()
                .setReply("hi, "+greeting).build();
        responseObserver.onNext(rp);
        responseObserver.onCompleted();
    }

}