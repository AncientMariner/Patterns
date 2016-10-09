package org.xander.structural.Proxy.ProtectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    PersonBeanImpl personBeanImpl;

    public OwnerInvocationHandler(PersonBeanImpl personBeanImpl) {
        this.personBeanImpl = personBeanImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) return method.invoke(personBeanImpl, args);
            else if (method.getName().equals("setHotOrNotDating")) throw new IllegalAccessException();
            else if (method.getName().startsWith("set")) return method.invoke(personBeanImpl, args);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
