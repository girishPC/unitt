package com.unitt.servicemanager.websocket;


import java.io.Serializable;
import java.util.Date;


public class MessageRoutingInfo implements Serializable
{
    public enum MessageResultType
    {
        Error,
        CompleteSuccess;
    }
    
    private static final long serialVersionUID = 3745930724237990205L;
    
    private String sessionId;
    private String requestId;
    private String serviceName;
    private String methodSignature;
    private int    timeToLiveInMills;
    private Date   sent;
    private String uid;
    private String websocketId;
    private String serverId;
    private Short serializerType;
    private MessageResultType resultType;

    
    // getters & setters
    // ---------------------------------------------------------------------------
    public String getSessionId()
    {
        return sessionId;
    }

    public void setSessionId( String aSessionId )
    {
        sessionId = aSessionId;
        uid = getSessionId() + "::" + getRequestId();
    }

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId( String aRequestId )
    {
        requestId = aRequestId;
        uid = getSessionId() + "::" + getRequestId();
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public void setServiceName( String aServiceName )
    {
        serviceName = aServiceName;
    }

    public String getMethodSignature()
    {
        return methodSignature;
    }

    public void setMethodSignature( String aMethodSignature )
    {
        methodSignature = aMethodSignature;
    }

    public int getTimeToLiveInMills()
    {
        return timeToLiveInMills;
    }

    public void setTimeToLiveInMills( int aTimeToLiveInMills )
    {
        timeToLiveInMills = aTimeToLiveInMills;
    }

    public Date getSent()
    {
        return sent;
    }

    public void setSent( Date aSent )
    {
        sent = aSent;
    }

    public String getWebsocketId()
    {
        return websocketId;
    }

    public void setWebsocketId( String aWebsocketId )
    {
        websocketId = aWebsocketId;
    }

    public String getUid()
    {
        return uid;
    }

    public String getServerId()
    {
        return serverId;
    }

    public void setServerId( String aServerId )
    {
        serverId = aServerId;
    }
    
    public Short getSerializerType()
    {
        return serializerType;
    }

    public void setSerializerType( Short aSerializerType )
    {
        serializerType = aSerializerType;
    }
    
    public MessageResultType getResultType()
    {
        return resultType;
    }

    public void setResultType( MessageResultType aResultType )
    {
        resultType = aResultType;
    }
    

    // Object overrides
    // ------------------------------------------------
    @Override
    public String toString()
    {
        return "MessageRoutingInfo [serverId= " + serverId + ", websocketId=" + websocketId + ", sessionId=" + sessionId + ", requestId=" + requestId + ", uid=" + uid + ", serviceName=" + serviceName + ", methodSignature=" + methodSignature + ", serializerType=" + serializerType + ", sent=" + sent + ", timeToLiveInMills=" + timeToLiveInMills + ", resultType=" + resultType + "]";
    }
}
