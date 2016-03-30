package com.yunlonglee.www.server;

import com.yunlonglee.www.common.Address;
import com.yunlonglee.www.common.Contact;
import com.yunlonglee.www.common.ContactResource;
import org.restlet.resource.ServerResource;

/**
 * Created by lijie on 3/29/16.
 */
public class ContactServerResource extends ServerResource implements ContactResource {
    private static volatile Contact contact = new Contact("leeyunlong", "Tiger", new Address("10 bd Google", null, "20010", "Mountain View", "USA"), 40);


    public Contact retrieve() {
        return contact;
    }

    public void store(Contact contact) {
        ContactServerResource.contact =  contact;
    }

    public void remove() {
        contact = null;
    }
}
