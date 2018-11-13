package com.repi.store;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class RESTStore  extends ServerResource {
    public static void main(String[] args) throws Exception{
        System.out.printf("Hello World!");
        Server helloServer = new Server(Protocol.HTTP, 8111, RESTStore.class);
        helloServer.start();
    }
    @Get
    public String represent () {
        System.out.println("Got request");
        return "Hello World";
    }
}
