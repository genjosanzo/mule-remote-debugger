/**
 *
 * (c) 2011 MuleSoft, Inc. This software is protected under international copyright
 * law. All use of this software is subject to MuleSoft's Master Subscription Agreement
 * (or other master license agreement) separately entered into in writing between you and
 * MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mule.debugger.commands;

import org.mule.debugger.response.DebuggerResponse;
import org.mule.debugger.response.ExitDebuggerResponse;

public class ExitCommandImpl extends AbstractCommand
{

    public static final String EXIT = "exit";

    public DebuggerResponse execute()
    {
        getHandler().stop();
        getCurrentSession().stop();
        return new ExitDebuggerResponse();
    }

    public String getId()
    {
        return EXIT;
    }
}
