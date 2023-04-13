<%@ include file="../init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/lecture/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addLecture" var="addLectureURL" />

<h1>Add a lecture: <h1>


<aui:form action="<%= addLectureURL %>" name="<portlet:namespace />fm">

	<aui:fieldset>

		<aui:input name="Title" />
		<aui:input name="VideoURL" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"> onClick="<%= addLectureURL.toString() %>"</aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>
