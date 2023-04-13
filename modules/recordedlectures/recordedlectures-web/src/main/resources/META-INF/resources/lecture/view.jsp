<%@include file="../init.jsp"%>

<%
long recordedlectureId = Long.valueOf((Long) renderRequest
        .getAttribute("recordedlectureId"));
%>

<aui:button-row cssClass="lecture-buttons">


    <portlet:renderURL var="addLectureURL">
        <portlet:param name="mvcPath" value="/lecture/add_lecture.jsp"></portlet:param>
          <portlet:param name="recordedlectureId"
                    value="<%=String.valueOf(recordedlectureId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addLectureURL.toString() %>" value="Add Lecture"></aui:button>

</aui:button-row>



<liferay-ui:search-container total="<%=LectureLocalServiceUtil.getLecturesCount()%>">


<liferay-ui:search-container-results results="<%=LectureLocalServiceUtil.getLectures(scopeGroupId.longValue(), searchContainer.getStart(), searchContainer.getEnd())%>" />

<liferay-ui:search-container-row className="com.liferay.docs.recordedlectures.model.Lecture" modelVar="lecture">

    <liferay-ui:search-container-column-text property="title" valign="top" />

    <liferay-ui:search-container-column-text property="videoURL" />

    <%
    String convertURL = lecture.getVideoURL();
    convertURL = convertURL.replace("watch?v=", "embed/");
    System.out.println(convertURL);
    session.setAttribute("URL",convertURL);
    %>

    <liferay-ui:search-container-column-text name="Video">

        <iframe id="videoOne" width="420" height="315"
        src='<%=session.getAttribute("URL").toString()%>'>
        </iframe>

    </liferay-ui:search-container-column-text>


    <liferay-ui:search-container-column-jsp
        align="right"
        path="/lecture/lecture_actions.jsp" />

</liferay-ui:search-container-row>




<liferay-ui:search-iterator />

</liferay-ui:search-container>