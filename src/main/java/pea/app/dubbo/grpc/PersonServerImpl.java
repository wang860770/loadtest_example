package pea.app.dubbo.grpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import pea.grpc.Person;
import pea.grpc.PersonServiceGrpc;

@GRpcService
public class PersonServerImpl extends PersonServiceGrpc.PersonServiceImplBase {
    @Override
    public void sayHi(Person.HiRequest request, StreamObserver<Person.HiResponse> responseObserver) {
        String greeting = request.getName();
        System.out.println("PersonServerImpl收到客户端的:" + greeting);
        Person.HiResponse rp = Person.HiResponse.newBuilder()
                .setMessage("hi, "+greeting).build();
        responseObserver.onNext(rp);
        responseObserver.onCompleted();
    }
}