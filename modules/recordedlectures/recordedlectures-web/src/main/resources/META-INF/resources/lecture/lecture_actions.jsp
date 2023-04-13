<%@include file="../init.jsp"%>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Lecture entry = (Lecture)row.getObject();
%>

<liferay-ui:icon-menu>

        <portlet:actionURL name="deleteLecture" var="deleteURL">
            <portlet:param name="recordedlectureId"
                value="<%= String.valueOf(entry.getRecordedlectureId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />

</liferay-ui:icon-menu>
