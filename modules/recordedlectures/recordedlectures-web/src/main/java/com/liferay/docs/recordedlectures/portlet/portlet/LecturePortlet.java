package com.liferay.docs.recordedlectures.portlet.portlet;

import com.liferay.docs.recordedlectures.model.Lecture;
import com.liferay.docs.recordedlectures.portlet.constants.LecturePortletKeys;

import com.liferay.docs.recordedlectures.service.LectureLocalService;
import com.liferay.docs.recordedlectures.service.lectureUploadLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author noah
 */
@Component(
	immediate = true,
	property = {
		/*"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Lecture",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LecturePortletKeys.LECTURE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
*/
			"com.liferay.portlet.header-portlet-css=/css/main.css",
			"com.liferay.portlet.display-category=category.social",
			"com.liferay.portlet.instanceable=false",
			"com.liferay.portlet.scopeable=true",
			"javax.portlet.display-name=Lecture",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/lecture/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.supports.mime-type=text/html",
			"javax.portlet.name=" + LecturePortletKeys.LECTURE

	},
	service = Portlet.class
)
public class LecturePortlet extends MVCPortlet
{
	@Reference
	private LectureLocalService _lectureLocalService;

	@Reference
	private lectureUploadLocalService _lectureUploadLocalService;



	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Lecture.class.getName(), renderRequest);

			long groupId = serviceContext.getScopeGroupId();

			long recordedlectureId = ParamUtil.getLong(renderRequest, "recordedlectureId");

			List<Lecture> lectureList = _lectureLocalService.getLectures(
					groupId);

			if (lectureList.isEmpty()) {
				Lecture lecture = _lectureLocalService.addLecture(
						serviceContext.getUserId(), "Main", "", serviceContext);

				recordedlectureId = lecture.getRecordedlectureId();
			}

			if (recordedlectureId == 0) {
				recordedlectureId = lectureList.get(0).getRecordedlectureId();
			}

			renderRequest.setAttribute("recordedlectureId", recordedlectureId);
		}
		catch (Exception e) {
			throw new PortletException(e);
		}

		super.render(renderRequest, renderResponse);
	}



	public void addLecture(ActionRequest request, ActionResponse response)
			throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Lecture.class.getName(), request);

		String title = ParamUtil.getString(request, "Title");
		String URL = ParamUtil.getString(request, "VideoURL");
		long lectureId = ParamUtil.getLong(request, "recordedlectureId");



			try {
				_lectureLocalService.addLecture(serviceContext.getUserId(), title, URL, serviceContext);

				response.setRenderParameter(
						"recordedlectureId", Long.toString(lectureId));

			}
			catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter(
						"mvcPath", "/lecture/add_lecture.jsp");
			}

	}

	public void deleteLecture(ActionRequest request, ActionResponse response) throws PortalException
	{
		long recordedlectureId = ParamUtil.getLong(request, "recordedlectureId");
		//long guestbookId = ParamUtil.getLong(request, "guestbookId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Lecture.class.getName(), request);

		try {

			response.setRenderParameter(
					"recordedlectureId", Long.toString(recordedlectureId));

			_lectureLocalService.deleteLecture(recordedlectureId);
		}

		catch (Exception e) {
			Logger.getLogger(LecturePortlet.class.getName()).log(
					Level.SEVERE, null, e);
		}
	}
}

