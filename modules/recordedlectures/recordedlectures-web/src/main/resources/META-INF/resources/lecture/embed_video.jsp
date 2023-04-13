<%@include file="../init.jsp"%>

<iframe id="videoOne" width="420" height="315"
src='<%=session.getAttribute("URL").toString()%>'>
</iframe>

<%
    System.out.println(session.getAttribute("URL").toString());
%>


