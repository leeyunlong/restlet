package com.yunlonglee.www.client;

import com.yunlonglee.www.common.Contact;
import org.restlet.resource.*;

/**
 * Created by lijie on 3/29/16.
 */
public interface ContactResourceProxy extends ClientProxy {
    @Get
    public void retrieve(Result<Contact> callback);

    @Put
    public void store(Contact contact, Result<Void> callback);

    @Delete
    public void remove(Result<Void> callback);
}
