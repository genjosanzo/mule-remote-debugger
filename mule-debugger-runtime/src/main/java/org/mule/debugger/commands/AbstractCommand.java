/**
 *
 * (c) 2011 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mule.debugger.commands;

import com.google.gson.Gson;
import org.mule.debugger.server.DebuggerHandler;
import org.mule.debugger.server.DebuggerServerSession;

public abstract class AbstractCommand implements ICommand
{
    private DebuggerServerSession currentSession;
    private DebuggerHandler handler;

    public DebuggerServerSession getCurrentSession()
    {
        return currentSession;
    }

    public DebuggerHandler getHandler()
    {
        return handler;
    }


    public void setCurrentSession(DebuggerServerSession currentSession)
    {
        this.currentSession = currentSession;
    }

    public void setHandler(DebuggerHandler handler)
    {
        this.handler = handler;
    }



    protected String objectToString(Object result)
    {
        Gson gson = new Gson();
        return gson.toJson(result);
    }
}
