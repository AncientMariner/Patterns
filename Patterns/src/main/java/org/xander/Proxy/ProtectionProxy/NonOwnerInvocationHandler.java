package org.xander.Proxy.ProtectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler  implements InvocationHandler {
    PersonBeanImpl personBeanImpl;

    public NonOwnerInvocationHandler(PersonBeanImpl personBeanImpl) {
        this.personBeanImpl = personBeanImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get"))                 return method.invoke(personBeanImpl, args);
            else if (method.getName().equals("setHotOrNotDating")) return method.invoke(personBeanImpl, args);
            else if (method.getName().startsWith("set"))           throw new IllegalAccessException();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
