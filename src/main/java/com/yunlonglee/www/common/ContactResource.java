package com.yunlonglee.www.common;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;

/**
 * Created by lijie on 3/29/16.
 */
public interface ContactResource {
    @Get
    public Contact retrieve();
    @Put
    public void store(Contact contact);
    @Delete
    public void remove();

}
