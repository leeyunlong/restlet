package com.yunlonglee.www.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

/**
 * Created by lijie on 3/29/16.
 */
public class TestServerApplication extends Application {
    @Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.attachDefault(new Directory(getContext(),"war:///"));
        router.attach("/contacts/123",ContactServerResource.class);
        return router;
    }
}
